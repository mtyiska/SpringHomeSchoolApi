package com.teched.app.ws.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

@MappedSuperclass
public class TimestampedEntity implements Comparable<TimestampedEntity>, Serializable {

    private static final long serialVersionUID = -592129286256341695L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected  Long id;

    @Column(nullable = false)
    private ZonedDateTime createdAt;

    @Column(nullable = false)
    private ZonedDateTime updatedAt;

    @PrePersist
    public void prePersist(){createdAt = updatedAt = ZonedDateTime.now();}

    @PreUpdate
    public void preUpdate(){updatedAt = ZonedDateTime.now();}

    @Override
    public int compareTo(TimestampedEntity o) {
        return this.getId().compareTo(o.getId());
    }

    public boolean equals(Object other) {
        if (other == null || other.getClass() != this.getClass() || getId() == null) {
            return false;
        }

        return this.getId().equals(((TimestampedEntity) other).getId());
    }

    /*public int hashCode() {
        return new HashCodeBuilder().append(getId()).toHashCode();
    }

     */

    public Long getId() {
        return id;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }
}

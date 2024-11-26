package entity.baseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class ChangeTrackerEntity extends BaseEntity{
    @Column(name = "created_on", updatable = false)
    private LocalDateTime created;

    @Column(name = "update_on")
    private LocalDateTime updated;

    @PrePersist
    public void onCreate() {
        created = LocalDateTime.now();
    }

    @PreUpdate
    public void onUpdate() {
        updated = LocalDateTime.now();
    }
}

package entity.baseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.hibernate.annotations.JdbcType;
import org.hibernate.type.descriptor.jdbc.LongVarcharJdbcType;

import java.util.UUID;

@MappedSuperclass
@Data
public abstract class BaseEntity {

    @Id
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "VARCHAR(36)")
    @JdbcType(LongVarcharJdbcType.class)
    private UUID id = UUID.randomUUID();
}

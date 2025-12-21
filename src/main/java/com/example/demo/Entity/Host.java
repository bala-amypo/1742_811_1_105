package .com.example.demo.Entity
import jakarta.persistence.*;

@Entity
@Table(
    name = "Host",
    uniqueConstraints={
        @UniqueConstraint(
            columnNames={"email"}
        )
    }
)
public class Host{
    public Host(){}

    
}

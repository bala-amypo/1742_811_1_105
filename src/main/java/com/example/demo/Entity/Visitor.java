package .com.example.demo.Entity
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(
    name = "Visitor",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"email"})
    }
)

public class Visitor{
    public Visitor(){}
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private String idProofNumber;
    private LocalDateTime createdAt;
}
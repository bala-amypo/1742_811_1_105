package .com.example.demo.Entity
import jakarta.persistence.*;

@Entity
@Table(name="Visitor",uniqueConstraints={
    @UniqueConsraint
})

public class Visitor{
    public Visitor(){}
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String email;
    private
}
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

    @Column(nullable = false) 
    private String email;

    private String phone;
    private String idProofNumber;
    private LocalDateTime createdAt;

     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdProofNumber() {
        return idProofNumber;
    }

    public void setIdProofNumber(String idProofNumber) {
        this.idProofNumber = idProofNumber;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "users")
public class User {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String login;
    private String password;
    private LocalDateTime created;
    private LocalDateTime modified;
    @ManyToMany
    private Set<Role> roles = new HashSet<>();
}

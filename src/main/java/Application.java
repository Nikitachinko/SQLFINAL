import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
public class Application {
    static UserDao userDao = new UserDaoImpl();
    static RoleDao roleDao = new RoleDaoImpl();

    public static void main(String[] args) {
        Role developer = Role.builder().role(RoleType.DEVELOPER).build();
        Role analyst = Role.builder().role(RoleType.ANALYST).build();
        Role tester = Role.builder().role(RoleType.TESTER).build();
        Role manager = Role.builder().role(RoleType.MANAGER).build();

        roleDao.add(developer);
        roleDao.add(analyst);
        roleDao.add(tester);
        roleDao.add(manager);

        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getById(1));
        User newUser = User.builder()
                .name("Nikita")
                .login("carticl")
                .password("2452")
                .created(LocalDateTime.now())
                .modified(LocalDateTime.now())
                .roles(roles)
                .build();
        User add = userDao.add(newUser);
        add.setRoles(roles);
    }
}

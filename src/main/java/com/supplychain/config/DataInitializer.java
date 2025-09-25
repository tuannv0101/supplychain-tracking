package com.supplychain.config;

import com.supplychain.entity.ERole;
import com.supplychain.entity.Role;
import com.supplychain.entity.User;
import com.supplychain.repository.RoleRepository;
import com.supplychain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (roleRepository.count() == 0) {
            roleRepository.save(new Role(ERole.ROLE_USER));
            roleRepository.save(new Role(ERole.ROLE_ADMIN));
            roleRepository.save(new Role(ERole.ROLE_MANAGER));
            roleRepository.save(new Role(ERole.ROLE_EMPLOYEE));
        }

        // Khởi tạo user admin mặc định
        if (!userRepository.existsByUsername("admin")) {
            User admin = new User();
            admin.setUsername("admin");
            admin.setEmail("admin@supplychain.com");
            admin.setPassword(passwordEncoder.encode("admin123"));

            Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
                    .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
            java.util.Set<Role> roles = new java.util.HashSet<>();
            roles.add(adminRole);
            admin.setRoles(roles);

            userRepository.save(admin);
        }

        // Khởi tạo user manager mặc định
        if (!userRepository.existsByUsername("manager")) {
            User manager = new User();
            manager.setUsername("manager");
            manager.setEmail("manager@supplychain.com");
            manager.setPassword(passwordEncoder.encode("manager123"));

            Role managerRole = roleRepository.findByName(ERole.ROLE_MANAGER)
                    .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
            java.util.Set<Role> roles = new java.util.HashSet<>();
            roles.add(managerRole);
            manager.setRoles(roles);

            userRepository.save(manager);
        }

        // Khởi tạo user employee mặc định
        if (!userRepository.existsByUsername("employee")) {
            User employee = new User();
            employee.setUsername("employee");
            employee.setEmail("employee@supplychain.com");
            employee.setPassword(passwordEncoder.encode("employee123"));

            Role employeeRole = roleRepository.findByName(ERole.ROLE_EMPLOYEE)
                    .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
            java.util.Set<Role> roles = new java.util.HashSet<>();
            roles.add(employeeRole);
            employee.setRoles(roles);

            userRepository.save(employee);
        }
    }
}

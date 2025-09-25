# Supply Chain Tracking System với JWT Authentication

Hệ thống quản lý chuỗi cung ứng với xác thực JWT và phân quyền sử dụng Spring Boot, Spring Security.

## Tính năng

- ✅ Đăng nhập/Đăng ký với JWT
- ✅ Phân quyền theo vai trò (Admin, Manager, Employee, User)
- ✅ Bảo mật API endpoints
- ✅ Database H2 (development) và MySQL (production)
- ✅ RESTful API

## Cấu trúc dự án

```
src/main/java/com/supplychain/
├── config/                 # Cấu hình
├── controller/             # REST Controllers
├── dto/                   # Data Transfer Objects
├── entity/                # JPA Entities
├── repository/            # JPA Repositories
├── security/              # Spring Security config
│   ├── jwt/              # JWT utilities
│   └── services/         # UserDetails services
└── SupplychainTrackingApplication.java
```

## API Endpoints

### Authentication
- `POST /api/auth/signin` - Đăng nhập
- `POST /api/auth/signup` - Đăng ký

### Test Endpoints (Public)
- `GET /api/test/all` - Truy cập công khai
- `GET /api/test/user` - Yêu cầu đăng nhập
- `GET /api/test/employee` - Chỉ Employee
- `GET /api/test/manager` - Chỉ Manager
- `GET /api/test/admin` - Chỉ Admin

### Admin Endpoints
- `GET /api/admin/dashboard` - Dashboard admin
- `GET /api/admin/users` - Quản lý người dùng
- `GET /api/admin/settings` - Cài đặt hệ thống

### Manager Endpoints
- `GET /api/manager/dashboard` - Dashboard manager
- `GET /api/manager/reports` - Xem báo cáo
- `GET /api/manager/team` - Quản lý nhóm

### Employee Endpoints
- `GET /api/employee/dashboard` - Dashboard employee
- `GET /api/employee/tasks` - Xem nhiệm vụ
- `GET /api/employee/profile` - Thông tin cá nhân

## Cách sử dụng

### 1. Chạy ứng dụng
```bash
mvn spring-boot:run
```

### 2. Truy cập H2 Console (Development)
- URL: http://localhost:8080/h2-console
- JDBC URL: jdbc:h2:mem:testdb
- Username: sa
- Password: password

### 3. Đăng nhập với tài khoản mặc định

#### Admin
- Username: `admin`
- Password: `admin123`

#### Manager
- Username: `manager`
- Password: `manager123`

#### Employee
- Username: `employee`
- Password: `employee123`

### 4. Test API với Postman/curl

#### Đăng nhập
```bash
curl -X POST http://localhost:8080/api/auth/signin \
  -H "Content-Type: application/json" \
  -d '{
    "username": "admin",
    "password": "admin123"
  }'
```

#### Sử dụng JWT Token
```bash
curl -X GET http://localhost:8080/api/admin/dashboard \
  -H "Authorization: Bearer YOUR_JWT_TOKEN"
```

#### Đăng ký user mới
```bash
curl -X POST http://localhost:8080/api/auth/signup \
  -H "Content-Type: application/json" \
  -d '{
    "username": "newuser",
    "email": "newuser@example.com",
    "password": "password123",
    "role": ["user"]
  }'
```

## Cấu hình

### JWT Settings (application.properties)
```properties
app.jwtSecret=mySecretKey123456789012345678901234567890123456789012345678901234567890
app.jwtExpirationMs=86400000
```

### Database
- **Development**: H2 in-memory database
- **Production**: MySQL (uncomment trong application.properties)

## Vai trò và quyền hạn

| Role | Quyền hạn |
|------|-----------|
| **USER** | Truy cập cơ bản |
| **EMPLOYEE** | Xem nhiệm vụ, cập nhật tiến độ |
| **MANAGER** | Quản lý nhân viên, xem báo cáo |
| **ADMIN** | Quản lý toàn bộ hệ thống |

## Bảo mật

- JWT Token với thời hạn 24 giờ
- Mã hóa password với BCrypt
- CORS được cấu hình
- CSRF protection tắt cho API
- Session stateless

## Phát triển thêm

1. Thêm validation cho DTOs
2. Implement refresh token
3. Thêm logging và monitoring
4. Unit tests và integration tests
5. Docker containerization
6. CI/CD pipeline

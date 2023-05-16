public enum RoleType {
    DEVELOPER("1-Разработчик"),
    ANALYST("2-Аналитик"),
    TESTER("3-Тестировщик"),
    MANAGER("4-Менеджер"),
    DESIGNER("5-Дизайнер"),
    DEFAULT("6-По умолчанию");

    private final String roleType;

    RoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRoleType() {
        return roleType;
    }

    @Override
    public String toString() {
        return "RoleType{" +
                "roleType='" + roleType + '\'' +
                '}';
    }
}

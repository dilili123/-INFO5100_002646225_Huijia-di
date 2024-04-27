class PartTime extends Student {
    public PartTime(String name, int id) {
        super(name, id);
    }

    @Override
    public void printDetails() {
        System.out.println("Part-Time Student: " + name + ", ID: " + id);
    }
}
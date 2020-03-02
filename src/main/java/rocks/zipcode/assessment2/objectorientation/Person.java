package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {

    private long id = 0;
    private String name;
    private Address address;

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        if (id != null) {
            this.id = id;
        } else {
            this.id = Long.MIN_VALUE;
        }

        if (name != null) {
            this.name = name;
        } else {
            this.name = "";
        }

        if (address != null) {
            this.address = address;
        } else {
            this.address = new Address();
        }

    }

    public Person() {
        this(Long.MIN_VALUE, "", new Address());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            boolean name = ((Person) o).getName().equals(this.name);
            boolean id = ((Person) o).getId() == this.id;
            boolean address = ((Person) o).getAddress().equals(this.address);
            return address && id && name;
        }

        return (Boolean)null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
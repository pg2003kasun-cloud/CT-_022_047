package Q4;
import Q4.Owner;

public class Bicycle {
    private Owner owner;  // Owner object instead of separate strings

    public Bicycle() {
        this.owner = new Owner();
    }

    public Bicycle(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() { return owner; }
    public void setOwner(Owner owner) { this.owner = owner; }
}
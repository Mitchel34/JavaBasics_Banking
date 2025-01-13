package JavaBasics_Banking;

/* Encapsulation: We keep mamber data private and expose it
 * through piublic getters and setters. A "Member" represents a bank customer with 
 * specifit attributes eg. name, age, address, ssn, rank.
 */

 public class Member {
    private String name;
    private int age;
    private String address;
    private String ssn;
    private String militaryRank;

    //Constructor that accepts all fields
    public Member(String name, int age, String address, String ssn, String militaryRank){
        this.name = name;
        this.age = age;
        this.address = address;
        this.ssn = ssn;
        this.militaryRank = militaryRank;
    }

    //Constructor that doesn't require adress, ssn, or rank.
    public Member(String name, int age) {
        this(name, age, "Unkown Adress", "Unknown SSN", "Unknown Rank");
    }

    //Getters and Setters, part of Encapsulation is controlling access to private fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getMilitaryRank() {
        return militaryRank;
    }

    public void setMilitaryRank(String militaryRank) {
        this.militaryRank = militaryRank;
    }
 }


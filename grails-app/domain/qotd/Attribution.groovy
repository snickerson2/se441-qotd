package qotd

class Attribution {
    String name;

    static constraints = {
        name nullable: false
    }

    int length() {
       name.length()
    }
    
    String getName() {
       name
    }
}

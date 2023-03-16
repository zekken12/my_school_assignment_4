package project;

import java.util.Arrays;

final class Person implements Comparable<Person>{
        private final String prsi;

        private final String name;

        private final String dateOfBirth;
        
        Person(String prsi, String name, String dateOfBirth){

                this.prsi = prsi; 
                this.name = name; 
                this.dateOfBirth = dateOfBirth;

        }
        
        // Getter method 
        
        public String getPrsi(){
                return prsi;
        }

        public String getName(){
                return name;
        }

        public String getDateOfBirth(){
                return dateOfBirth;
        }

        @Override
        public boolean equals(Object ob) {
                
                if(ob == null) {
                        return false;
                }
                
                if(!(ob instanceof Person)){
                        return false;
                }
                
                Person p = (Person)ob;
                if(this.getPrsi().equals(p.getPrsi())) {
                        return true;
                }
                else {
                        return false;
                }
        }

        @Override
        public String toString() {
                return this.getPrsi() + " " + this.getName() + " " + this.getDateOfBirth();
        }

        @Override
        public int hashCode() {
                return super.hashCode();
        }

        @Override
        public int compareTo(Person person) {
                return this.getPrsi().compareTo(person.getPrsi());
        }

        public static void main(String[] args) {
                
                // Create objects Person
                Person p1 = new Person("Person1", "Jackson", "1-2-1999");
                Person p2 = new Person("Person2", "Jake", "5-8-2000");
                Person p3 = new Person("Person3", "Jay", "30-9-2001");
                
                System.out.println(p1.equals(p2));
                
                // hashCode of object p1
                System.out.println(p1.hashCode());
                 
                Person array[] = new Person[5];
                array[0] = p1;
                array[1] = p2;
                array[2] = p3;
                
                // Sort the Array 
                Arrays.sort(array);
               
                for(int i = 0; i < array.length; i++) {
                        System.out.println(array[i]);
                }
        }
}       
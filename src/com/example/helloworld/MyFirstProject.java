package com.example.helloworld;

// Aici am creat o clasa (OBIECT) denumita `Person` care contine Numele unei persoane, Varsta si Locul de nastere al acelei persoane.
class Person {

    // Aici setam MODIFICATORUL DE ACCES ca si PRIVATE pentru fiecare proprietate ca sa securizam informatiile despre fiecare persoana.
    private String name;            // Numele care e de tip String ( adica contine litere )
    private int age;                // Varsta care e de tip int ( adica contine doar cifre )
    private String placeOfBirth;    // Locul nasterii care e tot de tip String ( adica poate contine orice tip de litere, cifre, chiar si litere chinezesti).

    // Tot in clasa Person am creat un CONSTRUCTOR care are 3 parametri si care ne ajuta mai tarziu sa definim Persoane folosind cele 3 proprietati de mai sus (name, age, placeOfBirth).
    // CONSTRUCTORUL are MEREU acelasi nume ca si CLASA in care e creat.
    Person(String name, int age, String placeOfBirth) {

        /* `this` este un keyword folosit sa accesezi variabilele definite in clasa curenta (te uiti unde incepe acolada { dupa cuvantul CLASS
        si unde se termina } ca sa vezi ce proprietati pot fi accesate in acea clasa folosind keywordul `this.`
         Apoi ii spunem calculatorului ca orice nume, varsta si loc de nastere am declara intre partantezele rotunde `Person("Ion", 75, "Iasi")` el sa
         stie sa asocieze acele valori cu proprietatile corespunzatoare din obiectul Person.
         */
        this.name = name;
        this.age = age;
        this.placeOfBirth = placeOfBirth;
    }

    public Person(){
    }

    // Declaram un getter (o functie care NU POATE SCRIE date in obiectul nostru Person, ci DOAR CITESTE anumite informatii din obiectul nostru Person) si acest getter ne va spune care este NUMELE persoanei.
    // Adica aceasta functie denumita in informatica `getter` doar citeste numele persoanei care sa zicem este Mihai, dar acest getter nu are acces sa modifice numele. Adica reprezinta o functie ReadOnly.
    public String getName(){
        return name;
    }

    // Declaram un getter (o functie care NU POATE SCRIE date in obiectul nostru Person, ci DOAR CITESTE anumite informatii din obiectul nostru Person) si acest getter ne va spune care este VARSTA persoanei.
    public int getAge(){
        return age;
    }

    // Declaram un getter (o functie care NU POATE SCRIE date in obiectul nostru Person, ci DOAR CITESTE anumite informatii din obiectul nostru Person) si acest getter ne va spune care este LOCUL NASTERII persoanei.
    public String getPlaceOfBirth(){
        return placeOfBirth;
    }

    // Declaram un SETTER (o functie care se ocupa DOAR SA SCRIE date in obiect) si va scrie numele persoanei in obiectul nostru.
    public void setName(String name) {
        this.name = name;
    }

    // Declaram un SETTER (o functie care se ocupa DOAR SA SCRIE date in obiect) si va scrie varsta persoane in obiectul nostru. Daca varsta ce o declaram de la tastatura este mai mica de 0 atunci va da eroare.
    public void setAge(int age){
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("ERROR ! The age can't be negative !");
        }
    }

    // Declaram un SETTER (o functie care se ocupa DOAR SA SCRIE date in obiect) si va scrie locul nasterii persoanei in obiectul nostru.
    public void setPlaceOfBirth(String placeOfBirth){
        this.placeOfBirth = placeOfBirth;
    }
}

public class MyFirstProject {
    public static void main(String[] args) {

        // Declaram prima persoana folosindu-ne de SETTERS (functiile care scriu date in obiectul nostru Person)
        Person person1 = new Person();
        person1.setName("Mihai");
        person1.setAge(-99);
        person1.setPlaceOfBirth("Campulung Moldovenesc");

        // Declaram a doua persoana
        Person person2 = new Person();
        person2.setName("Florentin");
        person2.setAge(30);
        person2.setPlaceOfBirth("Sadova");

        // Declaram a treia persoana
        Person person3 = new Person();
        person3.setName("Donald Trump");
        person3.setAge(75);
        person3.setPlaceOfBirth("United States of America");

        // Aici cream o lista cu persoanele de mai sus
        Person[] people = { person1, person2, person3 };

        /*
        Aici avem un FOR. Atunci cand vezi acest keyword sa te gandesti automat ca el e folosit ca sa parcurgi o lista de elemente.
        In cazul nostru aceste elemente sunt niste Persoane definite intr-o lista ca si in viata reala cand ai niste oameni trecuti pe un carnetel.
        In viata reala noi mergem cu degetul de la prima persoana pana la ultima persoana si le verificam pe toate,
        in informatica calculatorul verifica o lista de 10 000 persoane intr-o secunda in functie de ce procesor are calculatorul.
        Acum ca am parcurs toata lista intr-o secunda vom afisa in consola detaliile despre fiecare persoana cum ar fi: numele, varsta, locul nasterii.
        */
        for (Person eachPerson: people) {
            /* Pentru ca am setat cate un getter pentru Nume, Varsta si Locul Nasterii ca si PUBLIC in clasa Person acum putem accesa acesti getters (functii care doar citesc date) folosind simbolul punct `.`,
            iar IntelliSense-ul (auto-sugestia) le va afisa automat. */
            System.out.println("Numele fiecarei persoane: " + eachPerson.getName() + ", " +
                    "Varsta: " + eachPerson.getAge() + ", " +
                    "Locul nasterii: " + eachPerson.getPlaceOfBirth());
        }

        System.out.println("\nTHE END !");
    }
}

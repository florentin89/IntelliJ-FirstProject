package com.example.helloworld;

// Aici am creat o clasa (OBIECT) denumita `Person` care contine Numele unei persoane, Varsta si Locul de nastere al acelei persoane.
class Person {

    // Aici setam MODIFICATORUL DE ACCES ca si PUBLIC pentru fiecare proprietate ca sa putem accesa mai tarziu numele, varsta si locul nasterii.
    // Daca modifici din PUBLIC in PRIVATE o sa vezi ca nu mai merge aplicatia pentru ca nu mai are acces la aceste informatii despre fiecare persoana.
    public String name;            // Numele care e de tip String ( adica contine litere )
    public int age;                // Varsta care e de tip int ( adica contine doar cifre )
    public String placeOfBirth;    // Locul nasterii care e tot de tip String ( adica poate contine orice tip de litere, cifre, chiar si litere chinezesti).

    // Tot in clasa Person am creat un CONSTRUCTOR care are 3 parametri si care ne ajuta mai tarziu sa definim Persoane folosind cele 3 proprietati de mai sus (name, age, placeOfBirth).
    Person(String name, int age, String placeOfBirth) {

        /* `this` este un keyword folosit sa accesezi variabilele definite in clasa curenta (te uiti unde incepe acolada { dupa cuvantul CLASS
        si unde se termina } ca sa vezi ce proprietati pot fi accesate in acea clasa folosind keywordul `this.`
         Apoi ii spunem calculatorului ca orice nume, varsta si loc de nastere am declara intre partantezele rotunde `Person("Ion", 75, "Iasi")` el sa
         stie asocieze acele valori cu proprietatile corespunzatoare din obiectul Person.
         */
        this.name = name;
        this.age = age;
        this.placeOfBirth = placeOfBirth;
    }
}

public class MyFirstProject {
    public static void main(String[] args) {

        // Aici folosindu-ne de CONSTRUCTORUL definit mai sus in clasa Person o sa cream un array (o lista) de persoane.
        Person[] people = {
                new Person("Mihai", 28, "Campulung Moldovenesc"),
                new Person("Florentin", 30, "Sadova"),
                new Person("Donald Trump", 73, "United States of America")
        };

        /*
        Aici avem un FOR. Atunci cand vezi acest keyword sa te gandesti automat ca el e folosit ca sa parcurgi o lista de elemente.
        In cazul nostru aceste elemente sunt niste Persoane definite intr-o lista ca si in viata reala cand ai niste oameni trecuti pe un carnetel.
        In viata reala noi mergem cu degetul de la prima persoana pana la ultima persoana si le verificam pe toate,
        in informatica calculatorul verifica o lista de 10 000 persoane intr-o secunda in functie de ce procesor are calculatorul.
        Acum ca am parcurs toata lista intr-o secunda vom afisa in consola detaliile despre fiecare persoana cum ar fi: numele, varsta, locul nasterii.
        */
        for (Person eachPerson: people) {
            /* Pentru ca am setat numele, varsta si locul nasterii ca si PUBLIC in clasa Person acum le putem accesa folosind simbolul punct `.`,
            iar IntelliSense-ul (auto-sugestia) le va afisa automat. */
            System.out.println("Numele fiecarei persoane: " + eachPerson.name + ", " +
                    "Varsta: " + eachPerson.age + ", " +
                    "Locul nasterii: " + eachPerson.placeOfBirth);
        }

        System.out.println("\nTHE END !");
    }
}
package wiidget;

import java.util.ArrayList;
import java.util.List;

import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.library.html.datatable.ArrayListPageable;
import com.landasource.wiidget.library.html.datatable.Pageable;

public class DataFactory extends Wiidget {

    @Override
    public void run() {
    }

    public Pageable<?> getPageable() {

        final ArrayListPageable<Animal> arrayListPageable = new ArrayListPageable<Animal>(getAnimals(), 10);

        return arrayListPageable;

    }

    public List<Animal> getAnimals() {

        final List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Bömbi", 2));
        animals.add(new Animal("Lion", 1));
        animals.add(new Animal("Cica", 21));
        animals.add(new Animal("Buksi", 12));
        animals.add(new Animal("Fekete", 43));
        animals.add(new Animal("Mirci", 4));
        animals.add(new Animal("Jumbó", 5));
        animals.add(new Animal("Bagira", 5));
        animals.add(new Animal("Kacsa", 6));
        animals.add(new Animal("Brúnó", 7));
        animals.add(new Animal("Guga", 2));
        animals.add(new Animal("Baba", 3));
        animals.add(new Animal("Guga", 2));
        animals.add(new Animal("Baba", 3));
        animals.add(new Animal("Guga", 2));
        animals.add(new Animal("Baba", 3));

        animals.addAll(animals);
        animals.addAll(animals);
        animals.addAll(animals);

        //Collections.shuffle(animals);

        return animals;

    }

    public static class Animal {
        public String name;
        public Integer age;

        public Animal(final String name, final Integer age) {
            super();
            this.name = name;
            this.age = age;
        }

    }

}

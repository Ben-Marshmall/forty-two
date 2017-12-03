package fr.sukub.fortytwo;

import org.beryx.streamplify.permutation.Permutations;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Find the solution of 42 x *** = **** by checking each permutation
 * @author Ben
 */
public class Finder {

    /**
     * Launch
     * @param args No argument
     */
    public static void main(String[] args) {
        // Index to figures
        final Integer[] FIGURES = {1, 3, 5, 6, 7, 8, 9};

        // Create the permutations
        Optional<Operation> result = new Permutations(FIGURES.length).stream() // Stream<index[]>
                .map(
                        permutation -> Arrays.stream(permutation) // index[] -> Stream<index>
                                .mapToObj(i -> FIGURES[i]) // index -> figure
                                .collect(Collectors.toList()) // Stream<figure> -> List<Figure>
                )
                .map(Operation::new) // List<Figure> -> Operation
                .filter(Operation::check) // Filter checked
                .findFirst(); // Stop

        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.err.println("No solution found.");
        }
    }

}

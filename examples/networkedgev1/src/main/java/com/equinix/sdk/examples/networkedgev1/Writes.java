package com.equinix.sdk.examples.networkedgev1;

/** Guard for examples that create, modify or delete resources. */
final class Writes {
    static final String VARIABLE = "EQUINIX_EXAMPLE_ALLOW_WRITES";

    private Writes() {}

    /**
     * Exits the program with a message unless EQUINIX_EXAMPLE_ALLOW_WRITES is "true". Call it first
     * in {@code main}, before any request is made.
     */
    static void requireOptIn(String whatItDoes) {
        if (!"true".equalsIgnoreCase(System.getenv(VARIABLE))) {
            System.err.println("This example " + whatItDoes + ".");
            System.err.println("It is skipped unless " + VARIABLE + "=true is set in the environment.");
            System.exit(1);
        }
    }

    /** Returns the named environment variable, exiting with a message when it is not set. */
    static String requireEnv(String name, String meaning) {
        String value = System.getenv(name);
        if (value == null || value.isEmpty()) {
            System.err.println("Set " + name + " to " + meaning + ".");
            System.exit(1);
        }
        return value;
    }
}

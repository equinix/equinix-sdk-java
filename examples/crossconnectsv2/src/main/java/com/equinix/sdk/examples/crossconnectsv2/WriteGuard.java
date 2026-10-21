package com.equinix.sdk.examples.crossconnectsv2;

/**
 * Keeps the examples that place or change orders from running by accident: they only send their
 * request when EQUINIX_EXAMPLE_ALLOW_WRITES is {@code true}.
 */
final class WriteGuard {
    private WriteGuard() {}

    /** Returns true if the caller opted in; otherwise prints how to opt in and returns false. */
    static boolean allowed() {
        if ("true".equals(System.getenv("EQUINIX_EXAMPLE_ALLOW_WRITES"))) {
            return true;
        }
        System.out.println("This example places or changes an order, so it is disabled by default.");
        System.out.println("Review the request, then set EQUINIX_EXAMPLE_ALLOW_WRITES=true to send it.");
        return false;
    }
}

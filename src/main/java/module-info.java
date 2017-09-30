/**
 * Module info for merged gRPC Java module.
 *
 * @author Aleksandar Seovic  2017.09.29
 */
module io.grpc
    {
    exports io.grpc;
    exports io.grpc.internal;
    exports io.grpc.stub;
    exports io.grpc.util;

    requires java.logging;
    requires java.naming;

    requires error.prone.annotations;
    requires guava;
    requires instrumentation.api;
    requires jsr305;
    requires opencensus.api;
    }
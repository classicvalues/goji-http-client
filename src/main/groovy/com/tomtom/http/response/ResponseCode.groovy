package com.tomtom.http.response

import static org.apache.http.HttpStatus.*

class ResponseCode {

    // 2XX
    public static final int OK = SC_OK
    public static final int CREATED = SC_CREATED
    public static final int ACCEPTED = SC_ACCEPTED
    public static final int NO_CONTENT = SC_NO_CONTENT

    // 3xx
    public static final int MOVED_PERMANENTLY = SC_MOVED_PERMANENTLY
    public static final int MOVED_TEMPORARILY = SC_MOVED_TEMPORARILY
    public static final int SEE_OTHER = SC_SEE_OTHER

    // 4XX
    public static final int BAD_REQUEST = SC_BAD_REQUEST
    public static final int UNAUTHORIZED = SC_UNAUTHORIZED
    public static final int FORBIDDEN = SC_FORBIDDEN
    public static final int NOT_FOUND = SC_NOT_FOUND
    public static final int METHOD_NOT_ALLOWED = SC_METHOD_NOT_ALLOWED
    public static final int NOT_ACCEPTABLE = SC_NOT_ACCEPTABLE
    public static final int CONFLICT = SC_CONFLICT
    public static final int UNSUPPORTED_MEDIA_TYPE = SC_UNSUPPORTED_MEDIA_TYPE

    // 5XX
    public static final int INTERNAL_SERVER_ERROR = SC_INTERNAL_SERVER_ERROR
    public static final int NOT_IMPLEMENTED = SC_NOT_IMPLEMENTED
    public static final int BAD_GATEWAY = SC_BAD_GATEWAY
    public static final int SERVICE_UNAVAILABLE = SC_SERVICE_UNAVAILABLE
    public static final int GATEWAY_TIMEOUT = SC_GATEWAY_TIMEOUT

}

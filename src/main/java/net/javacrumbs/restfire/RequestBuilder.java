/**
 * Copyright 2009-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.javacrumbs.restfire;

import java.net.URI;

/**
 * Interface for configuring the request.
 */
public interface RequestBuilder<T extends RequestBuilder<T>>  {

    /**
     * Sends request to address. Works in a clever way as to not override
     * values set by {@link #withHost(String)}, {@link #withPort(int)}  etc.
     * @param address
     * @return
     */
    T to(String address);

    /**
     * Sends request to address. Works in a clever way as to not override
     * values set by {@link #withHost(String)}, {@link #withPort(int)}  etc.
     * @param address
     * @return
     */
    T to(URI address);

    /**
     * Adds request header.
     * @param name
     * @param value
     * @return
     */
    T withHeader(String name, String value);

    /**
     * Adds query parameter.
     * @param name
     * @param value
     * @return
     */
    T withQueryParameter(String name, String value);

    /**
     * Sets URI path for the request.
     * @param uri
     * @return
     */
    T withPath(String uri);

    /**
     * Sets port for the request.
     * @param port
     * @return
     */
    T withPort(int port);

    /**
     * Sets port for the request.
     * @param host
     * @return
     */
    T withHost(String host);

    /**
     * Sets scheme for the request.
     * @param scheme
     * @return
     */
    T withScheme(String scheme);

    /**
     * Sets URI fragment.
     * @param fragment
     * @return
     */
    T withFragment(String fragment);


    /**
     * Sets the whole URI for the request. Default value is http://locahost:8080.
     * @param uri
     * @return
     */
    T withUri(URI uri);

    /**
     * Sets the whole URI for the request. Default value is http://locahost:8080.
     * @param uri
     * @return
     */
    T withUri(String uri);

    /**
     * Advanced configuration. RequestProcess can set multiple parameters at once.
     * @param requestProcessor
     * @return
     */
    T with(RequestProcessor requestProcessor);

    /**
     * Executes request and switches to response validation mode.
     * @return
     */
    ResponseValidator expectResponse();


}

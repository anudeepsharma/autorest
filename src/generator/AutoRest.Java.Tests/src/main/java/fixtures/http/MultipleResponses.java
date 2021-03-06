/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import fixtures.http.models.A;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in MultipleResponses.
 */
public interface MultipleResponses {
    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @return the A object if successful.
     */
    A get200Model204NoModelDefaultError200Valid();

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> get200Model204NoModelDefaultError200ValidAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @return the observable to the A object
     */
    Observable<A> get200Model204NoModelDefaultError200ValidAsync();

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> get200Model204NoModelDefaultError200ValidWithServiceResponseAsync();

    /**
     * Send a 204 response with no payload.
     *
     * @return the A object if successful.
     */
    A get200Model204NoModelDefaultError204Valid();

    /**
     * Send a 204 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> get200Model204NoModelDefaultError204ValidAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 204 response with no payload.
     *
     * @return the observable to the A object
     */
    Observable<A> get200Model204NoModelDefaultError204ValidAsync();

    /**
     * Send a 204 response with no payload.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> get200Model204NoModelDefaultError204ValidWithServiceResponseAsync();

    /**
     * Send a 201 response with valid payload: {'statusCode': '201'}.
     *
     * @return the A object if successful.
     */
    A get200Model204NoModelDefaultError201Invalid();

    /**
     * Send a 201 response with valid payload: {'statusCode': '201'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> get200Model204NoModelDefaultError201InvalidAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 201 response with valid payload: {'statusCode': '201'}.
     *
     * @return the observable to the A object
     */
    Observable<A> get200Model204NoModelDefaultError201InvalidAsync();

    /**
     * Send a 201 response with valid payload: {'statusCode': '201'}.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> get200Model204NoModelDefaultError201InvalidWithServiceResponseAsync();

    /**
     * Send a 202 response with no payload:.
     *
     * @return the A object if successful.
     */
    A get200Model204NoModelDefaultError202None();

    /**
     * Send a 202 response with no payload:.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> get200Model204NoModelDefaultError202NoneAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 202 response with no payload:.
     *
     * @return the observable to the A object
     */
    Observable<A> get200Model204NoModelDefaultError202NoneAsync();

    /**
     * Send a 202 response with no payload:.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> get200Model204NoModelDefaultError202NoneWithServiceResponseAsync();

    /**
     * Send a 400 response with valid error payload: {'status': 400, 'message': 'client error'}.
     *
     * @return the A object if successful.
     */
    A get200Model204NoModelDefaultError400Valid();

    /**
     * Send a 400 response with valid error payload: {'status': 400, 'message': 'client error'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> get200Model204NoModelDefaultError400ValidAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 400 response with valid error payload: {'status': 400, 'message': 'client error'}.
     *
     * @return the observable to the A object
     */
    Observable<A> get200Model204NoModelDefaultError400ValidAsync();

    /**
     * Send a 400 response with valid error payload: {'status': 400, 'message': 'client error'}.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> get200Model204NoModelDefaultError400ValidWithServiceResponseAsync();

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @return the A object if successful.
     */
    A get200Model201ModelDefaultError200Valid();

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> get200Model201ModelDefaultError200ValidAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @return the observable to the A object
     */
    Observable<A> get200Model201ModelDefaultError200ValidAsync();

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> get200Model201ModelDefaultError200ValidWithServiceResponseAsync();

    /**
     * Send a 201 response with valid payload: {'statusCode': '201', 'textStatusCode': 'Created'}.
     *
     * @return the A object if successful.
     */
    A get200Model201ModelDefaultError201Valid();

    /**
     * Send a 201 response with valid payload: {'statusCode': '201', 'textStatusCode': 'Created'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> get200Model201ModelDefaultError201ValidAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 201 response with valid payload: {'statusCode': '201', 'textStatusCode': 'Created'}.
     *
     * @return the observable to the A object
     */
    Observable<A> get200Model201ModelDefaultError201ValidAsync();

    /**
     * Send a 201 response with valid payload: {'statusCode': '201', 'textStatusCode': 'Created'}.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> get200Model201ModelDefaultError201ValidWithServiceResponseAsync();

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     * @return the A object if successful.
     */
    A get200Model201ModelDefaultError400Valid();

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> get200Model201ModelDefaultError400ValidAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     * @return the observable to the A object
     */
    Observable<A> get200Model201ModelDefaultError400ValidAsync();

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> get200Model201ModelDefaultError400ValidWithServiceResponseAsync();

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @return the Object object if successful.
     */
    Object get200ModelA201ModelC404ModelDDefaultError200Valid();

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> get200ModelA201ModelC404ModelDDefaultError200ValidAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @return the observable to the Object object
     */
    Observable<Object> get200ModelA201ModelC404ModelDDefaultError200ValidAsync();

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> get200ModelA201ModelC404ModelDDefaultError200ValidWithServiceResponseAsync();

    /**
     * Send a 200 response with valid payload: {'httpCode': '201'}.
     *
     * @return the Object object if successful.
     */
    Object get200ModelA201ModelC404ModelDDefaultError201Valid();

    /**
     * Send a 200 response with valid payload: {'httpCode': '201'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> get200ModelA201ModelC404ModelDDefaultError201ValidAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Send a 200 response with valid payload: {'httpCode': '201'}.
     *
     * @return the observable to the Object object
     */
    Observable<Object> get200ModelA201ModelC404ModelDDefaultError201ValidAsync();

    /**
     * Send a 200 response with valid payload: {'httpCode': '201'}.
     *
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> get200ModelA201ModelC404ModelDDefaultError201ValidWithServiceResponseAsync();

    /**
     * Send a 200 response with valid payload: {'httpStatusCode': '404'}.
     *
     * @return the Object object if successful.
     */
    Object get200ModelA201ModelC404ModelDDefaultError404Valid();

    /**
     * Send a 200 response with valid payload: {'httpStatusCode': '404'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> get200ModelA201ModelC404ModelDDefaultError404ValidAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Send a 200 response with valid payload: {'httpStatusCode': '404'}.
     *
     * @return the observable to the Object object
     */
    Observable<Object> get200ModelA201ModelC404ModelDDefaultError404ValidAsync();

    /**
     * Send a 200 response with valid payload: {'httpStatusCode': '404'}.
     *
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> get200ModelA201ModelC404ModelDDefaultError404ValidWithServiceResponseAsync();

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     * @return the Object object if successful.
     */
    Object get200ModelA201ModelC404ModelDDefaultError400Valid();

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> get200ModelA201ModelC404ModelDDefaultError400ValidAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     * @return the observable to the Object object
     */
    Observable<Object> get200ModelA201ModelC404ModelDDefaultError400ValidAsync();

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> get200ModelA201ModelC404ModelDDefaultError400ValidWithServiceResponseAsync();

    /**
     * Send a 202 response with no payload.
     *
     */
    void get202None204NoneDefaultError202None();

    /**
     * Send a 202 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> get202None204NoneDefaultError202NoneAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Send a 202 response with no payload.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> get202None204NoneDefaultError202NoneAsync();

    /**
     * Send a 202 response with no payload.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> get202None204NoneDefaultError202NoneWithServiceResponseAsync();

    /**
     * Send a 204 response with no payload.
     *
     */
    void get202None204NoneDefaultError204None();

    /**
     * Send a 204 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> get202None204NoneDefaultError204NoneAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Send a 204 response with no payload.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> get202None204NoneDefaultError204NoneAsync();

    /**
     * Send a 204 response with no payload.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> get202None204NoneDefaultError204NoneWithServiceResponseAsync();

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     */
    void get202None204NoneDefaultError400Valid();

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> get202None204NoneDefaultError400ValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> get202None204NoneDefaultError400ValidAsync();

    /**
     * Send a 400 response with valid payload: {'code': '400', 'message': 'client error'}.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> get202None204NoneDefaultError400ValidWithServiceResponseAsync();

    /**
     * Send a 202 response with an unexpected payload {'property': 'value'}.
     *
     */
    void get202None204NoneDefaultNone202Invalid();

    /**
     * Send a 202 response with an unexpected payload {'property': 'value'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> get202None204NoneDefaultNone202InvalidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Send a 202 response with an unexpected payload {'property': 'value'}.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> get202None204NoneDefaultNone202InvalidAsync();

    /**
     * Send a 202 response with an unexpected payload {'property': 'value'}.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> get202None204NoneDefaultNone202InvalidWithServiceResponseAsync();

    /**
     * Send a 204 response with no payload.
     *
     */
    void get202None204NoneDefaultNone204None();

    /**
     * Send a 204 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> get202None204NoneDefaultNone204NoneAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Send a 204 response with no payload.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> get202None204NoneDefaultNone204NoneAsync();

    /**
     * Send a 204 response with no payload.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> get202None204NoneDefaultNone204NoneWithServiceResponseAsync();

    /**
     * Send a 400 response with no payload.
     *
     */
    void get202None204NoneDefaultNone400None();

    /**
     * Send a 400 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> get202None204NoneDefaultNone400NoneAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Send a 400 response with no payload.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> get202None204NoneDefaultNone400NoneAsync();

    /**
     * Send a 400 response with no payload.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> get202None204NoneDefaultNone400NoneWithServiceResponseAsync();

    /**
     * Send a 400 response with an unexpected payload {'property': 'value'}.
     *
     */
    void get202None204NoneDefaultNone400Invalid();

    /**
     * Send a 400 response with an unexpected payload {'property': 'value'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> get202None204NoneDefaultNone400InvalidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Send a 400 response with an unexpected payload {'property': 'value'}.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> get202None204NoneDefaultNone400InvalidAsync();

    /**
     * Send a 400 response with an unexpected payload {'property': 'value'}.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> get202None204NoneDefaultNone400InvalidWithServiceResponseAsync();

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @return the A object if successful.
     */
    A getDefaultModelA200Valid();

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> getDefaultModelA200ValidAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @return the observable to the A object
     */
    Observable<A> getDefaultModelA200ValidAsync();

    /**
     * Send a 200 response with valid payload: {'statusCode': '200'}.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> getDefaultModelA200ValidWithServiceResponseAsync();

    /**
     * Send a 200 response with no payload.
     *
     * @return the A object if successful.
     */
    A getDefaultModelA200None();

    /**
     * Send a 200 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> getDefaultModelA200NoneAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 200 response with no payload.
     *
     * @return the observable to the A object
     */
    Observable<A> getDefaultModelA200NoneAsync();

    /**
     * Send a 200 response with no payload.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> getDefaultModelA200NoneWithServiceResponseAsync();

    /**
     * Send a 400 response with valid payload: {'statusCode': '400'}.
     *
     * @return the A object if successful.
     */
    A getDefaultModelA400Valid();

    /**
     * Send a 400 response with valid payload: {'statusCode': '400'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> getDefaultModelA400ValidAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 400 response with valid payload: {'statusCode': '400'}.
     *
     * @return the observable to the A object
     */
    Observable<A> getDefaultModelA400ValidAsync();

    /**
     * Send a 400 response with valid payload: {'statusCode': '400'}.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> getDefaultModelA400ValidWithServiceResponseAsync();

    /**
     * Send a 400 response with no payload.
     *
     * @return the A object if successful.
     */
    A getDefaultModelA400None();

    /**
     * Send a 400 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> getDefaultModelA400NoneAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 400 response with no payload.
     *
     * @return the observable to the A object
     */
    Observable<A> getDefaultModelA400NoneAsync();

    /**
     * Send a 400 response with no payload.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> getDefaultModelA400NoneWithServiceResponseAsync();

    /**
     * Send a 200 response with invalid payload: {'statusCode': '200'}.
     *
     */
    void getDefaultNone200Invalid();

    /**
     * Send a 200 response with invalid payload: {'statusCode': '200'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getDefaultNone200InvalidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Send a 200 response with invalid payload: {'statusCode': '200'}.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getDefaultNone200InvalidAsync();

    /**
     * Send a 200 response with invalid payload: {'statusCode': '200'}.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getDefaultNone200InvalidWithServiceResponseAsync();

    /**
     * Send a 200 response with no payload.
     *
     */
    void getDefaultNone200None();

    /**
     * Send a 200 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getDefaultNone200NoneAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Send a 200 response with no payload.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getDefaultNone200NoneAsync();

    /**
     * Send a 200 response with no payload.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getDefaultNone200NoneWithServiceResponseAsync();

    /**
     * Send a 400 response with valid payload: {'statusCode': '400'}.
     *
     */
    void getDefaultNone400Invalid();

    /**
     * Send a 400 response with valid payload: {'statusCode': '400'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getDefaultNone400InvalidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Send a 400 response with valid payload: {'statusCode': '400'}.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getDefaultNone400InvalidAsync();

    /**
     * Send a 400 response with valid payload: {'statusCode': '400'}.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getDefaultNone400InvalidWithServiceResponseAsync();

    /**
     * Send a 400 response with no payload.
     *
     */
    void getDefaultNone400None();

    /**
     * Send a 400 response with no payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getDefaultNone400NoneAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Send a 400 response with no payload.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getDefaultNone400NoneAsync();

    /**
     * Send a 400 response with no payload.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getDefaultNone400NoneWithServiceResponseAsync();

    /**
     * Send a 200 response with no payload, when a payload is expected - client should return a null object of thde type for model A.
     *
     * @return the A object if successful.
     */
    A get200ModelA200None();

    /**
     * Send a 200 response with no payload, when a payload is expected - client should return a null object of thde type for model A.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> get200ModelA200NoneAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 200 response with no payload, when a payload is expected - client should return a null object of thde type for model A.
     *
     * @return the observable to the A object
     */
    Observable<A> get200ModelA200NoneAsync();

    /**
     * Send a 200 response with no payload, when a payload is expected - client should return a null object of thde type for model A.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> get200ModelA200NoneWithServiceResponseAsync();

    /**
     * Send a 200 response with payload {'statusCode': '200'}.
     *
     * @return the A object if successful.
     */
    A get200ModelA200Valid();

    /**
     * Send a 200 response with payload {'statusCode': '200'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> get200ModelA200ValidAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 200 response with payload {'statusCode': '200'}.
     *
     * @return the observable to the A object
     */
    Observable<A> get200ModelA200ValidAsync();

    /**
     * Send a 200 response with payload {'statusCode': '200'}.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> get200ModelA200ValidWithServiceResponseAsync();

    /**
     * Send a 200 response with invalid payload {'statusCodeInvalid': '200'}.
     *
     * @return the A object if successful.
     */
    A get200ModelA200Invalid();

    /**
     * Send a 200 response with invalid payload {'statusCodeInvalid': '200'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> get200ModelA200InvalidAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 200 response with invalid payload {'statusCodeInvalid': '200'}.
     *
     * @return the observable to the A object
     */
    Observable<A> get200ModelA200InvalidAsync();

    /**
     * Send a 200 response with invalid payload {'statusCodeInvalid': '200'}.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> get200ModelA200InvalidWithServiceResponseAsync();

    /**
     * Send a 400 response with no payload client should treat as an http error with no error model.
     *
     * @return the A object if successful.
     */
    A get200ModelA400None();

    /**
     * Send a 400 response with no payload client should treat as an http error with no error model.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> get200ModelA400NoneAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 400 response with no payload client should treat as an http error with no error model.
     *
     * @return the observable to the A object
     */
    Observable<A> get200ModelA400NoneAsync();

    /**
     * Send a 400 response with no payload client should treat as an http error with no error model.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> get200ModelA400NoneWithServiceResponseAsync();

    /**
     * Send a 200 response with payload {'statusCode': '400'}.
     *
     * @return the A object if successful.
     */
    A get200ModelA400Valid();

    /**
     * Send a 200 response with payload {'statusCode': '400'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> get200ModelA400ValidAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 200 response with payload {'statusCode': '400'}.
     *
     * @return the observable to the A object
     */
    Observable<A> get200ModelA400ValidAsync();

    /**
     * Send a 200 response with payload {'statusCode': '400'}.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> get200ModelA400ValidWithServiceResponseAsync();

    /**
     * Send a 200 response with invalid payload {'statusCodeInvalid': '400'}.
     *
     * @return the A object if successful.
     */
    A get200ModelA400Invalid();

    /**
     * Send a 200 response with invalid payload {'statusCodeInvalid': '400'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> get200ModelA400InvalidAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 200 response with invalid payload {'statusCodeInvalid': '400'}.
     *
     * @return the observable to the A object
     */
    Observable<A> get200ModelA400InvalidAsync();

    /**
     * Send a 200 response with invalid payload {'statusCodeInvalid': '400'}.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> get200ModelA400InvalidWithServiceResponseAsync();

    /**
     * Send a 202 response with payload {'statusCode': '202'}.
     *
     * @return the A object if successful.
     */
    A get200ModelA202Valid();

    /**
     * Send a 202 response with payload {'statusCode': '202'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<A> get200ModelA202ValidAsync(final ServiceCallback<A> serviceCallback);

    /**
     * Send a 202 response with payload {'statusCode': '202'}.
     *
     * @return the observable to the A object
     */
    Observable<A> get200ModelA202ValidAsync();

    /**
     * Send a 202 response with payload {'statusCode': '202'}.
     *
     * @return the observable to the A object
     */
    Observable<ServiceResponse<A>> get200ModelA202ValidWithServiceResponseAsync();

}

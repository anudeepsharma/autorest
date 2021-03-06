/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.custombaseurimoreoptions.implementation;

import retrofit2.Retrofit;
import fixtures.custombaseurimoreoptions.Paths;
import com.google.common.base.Joiner;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import fixtures.custombaseurimoreoptions.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Paths.
 */
public class PathsImpl implements Paths {
    /** The Retrofit service to perform REST calls. */
    private PathsService service;
    /** The service client containing this operation class. */
    private AutoRestParameterizedCustomHostTestClientImpl client;

    /**
     * Initializes an instance of Paths.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PathsImpl(Retrofit retrofit, AutoRestParameterizedCustomHostTestClientImpl client) {
        this.service = retrofit.create(PathsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Paths to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PathsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.custombaseurimoreoptions.Paths getEmpty" })
        @GET("customuri/{subscriptionId}/{keyName}")
        Observable<Response<ResponseBody>> getEmpty(@Path("keyName") String keyName, @Path("subscriptionId") String subscriptionId, @Query("keyVersion") String keyVersion, @Header("x-ms-parameterized-host") String parameterizedHost);

    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     */
    public void getEmpty(String vault, String secret, String keyName) {
        getEmptyWithServiceResponseAsync(vault, secret, keyName).toBlocking().single().body();
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getEmptyAsync(String vault, String secret, String keyName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(getEmptyWithServiceResponseAsync(vault, secret, keyName), serviceCallback);
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getEmptyAsync(String vault, String secret, String keyName) {
        return getEmptyWithServiceResponseAsync(vault, secret, keyName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getEmptyWithServiceResponseAsync(String vault, String secret, String keyName) {
        if (vault == null) {
            throw new IllegalArgumentException("Parameter vault is required and cannot be null.");
        }
        if (secret == null) {
            throw new IllegalArgumentException("Parameter secret is required and cannot be null.");
        }
        if (this.client.dnsSuffix() == null) {
            throw new IllegalArgumentException("Parameter this.client.dnsSuffix() is required and cannot be null.");
        }
        if (keyName == null) {
            throw new IllegalArgumentException("Parameter keyName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String keyVersion = null;
        String parameterizedHost = Joiner.on(", ").join("{vault}", vault, "{secret}", secret, "{dnsSuffix}", this.client.dnsSuffix());
        return service.getEmpty(keyName, this.client.subscriptionId(), keyVersion, parameterizedHost)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getEmptyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param keyVersion The key version. Default value 'v1'.
     */
    public void getEmpty(String vault, String secret, String keyName, String keyVersion) {
        getEmptyWithServiceResponseAsync(vault, secret, keyName, keyVersion).toBlocking().single().body();
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param keyVersion The key version. Default value 'v1'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getEmptyAsync(String vault, String secret, String keyName, String keyVersion, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(getEmptyWithServiceResponseAsync(vault, secret, keyName, keyVersion), serviceCallback);
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param keyVersion The key version. Default value 'v1'.
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getEmptyAsync(String vault, String secret, String keyName, String keyVersion) {
        return getEmptyWithServiceResponseAsync(vault, secret, keyName, keyVersion).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param keyVersion The key version. Default value 'v1'.
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getEmptyWithServiceResponseAsync(String vault, String secret, String keyName, String keyVersion) {
        if (vault == null) {
            throw new IllegalArgumentException("Parameter vault is required and cannot be null.");
        }
        if (secret == null) {
            throw new IllegalArgumentException("Parameter secret is required and cannot be null.");
        }
        if (this.client.dnsSuffix() == null) {
            throw new IllegalArgumentException("Parameter this.client.dnsSuffix() is required and cannot be null.");
        }
        if (keyName == null) {
            throw new IllegalArgumentException("Parameter keyName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{vault}", vault, "{secret}", secret, "{dnsSuffix}", this.client.dnsSuffix());
        return service.getEmpty(keyName, this.client.subscriptionId(), keyVersion, parameterizedHost)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getEmptyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> getEmptyDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}

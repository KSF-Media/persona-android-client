/**
 * Persona
 * KSF Media unified login service
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiInvoker;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.openapitools.client.model.AdminNewUser;
import org.openapitools.client.model.FreePass;
import org.openapitools.client.model.FreePassInput;
import org.openapitools.client.model.InlineResponse400;
import org.openapitools.client.model.InlineResponse415;
import org.openapitools.client.model.LoginResponse;
import org.openapitools.client.model.SearchQuery;
import org.openapitools.client.model.SearchResult;
import java.util.UUID;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class AdminApi {
  String basePath = "http://http:/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Revokes an existing free pass
  * Marks a free pass as being revoked so that it can&#39;t be used anymore. Currently, revoked free passes can&#39;t be reinstated through Persona API (though it&#39;s possible to do so with an SQL query).
   * @param body 
   * @param authUser 
   * @param authorization 
   * @return void
  */
  public void adminFreePassDelete (String body, UUID authUser, String authorization) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling adminFreePassDelete",
        new ApiException(400, "Missing the required parameter 'body' when calling adminFreePassDelete"));
    }

    // create path and map variables
    String path = "/admin/free-pass";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("AuthUser", ApiInvoker.parameterToString(authUser));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    String[] contentTypes = {
      "application/json;charset=utf-8"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return ;
      } else {
         return ;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Revokes an existing free pass
   * Marks a free pass as being revoked so that it can&#39;t be used anymore. Currently, revoked free passes can&#39;t be reinstated through Persona API (though it&#39;s possible to do so with an SQL query).
   * @param body    * @param authUser    * @param authorization 
  */
  public void adminFreePassDelete (String body, UUID authUser, String authorization, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling adminFreePassDelete",
        new ApiException(400, "Missing the required parameter 'body' when calling adminFreePassDelete"));
    }

    // create path and map variables
    String path = "/admin/free-pass".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("AuthUser", ApiInvoker.parameterToString(authUser));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));

    String[] contentTypes = {
      "application/json;charset=utf-8"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Creates a free pass to an article
  * Free passes can be used to temporarily bypass the paywall for individual articles.
   * @param body 
   * @param authUser 
   * @param authorization 
   * @return String
  */
  public String adminFreePassPut (FreePassInput body, UUID authUser, String authorization) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling adminFreePassPut",
        new ApiException(400, "Missing the required parameter 'body' when calling adminFreePassPut"));
    }

    // create path and map variables
    String path = "/admin/free-pass";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("AuthUser", ApiInvoker.parameterToString(authUser));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    String[] contentTypes = {
      "application/json;charset=utf-8"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Creates a free pass to an article
   * Free passes can be used to temporarily bypass the paywall for individual articles.
   * @param body    * @param authUser    * @param authorization 
  */
  public void adminFreePassPut (FreePassInput body, UUID authUser, String authorization, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling adminFreePassPut",
        new ApiException(400, "Missing the required parameter 'body' when calling adminFreePassPut"));
    }

    // create path and map variables
    String path = "/admin/free-pass".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("AuthUser", ApiInvoker.parameterToString(authUser));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));

    String[] contentTypes = {
      "application/json;charset=utf-8"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((String) ApiInvoker.deserialize(localVarResponse,  "", String.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Lists all free passes
  * This end point returns the list of all free passes, including those that have been expired or revoked.
   * @param authUser 
   * @param authorization 
   * @return List<FreePass>
  */
  public List<FreePass> adminFreePassesGet (UUID authUser, String authorization) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/admin/free-passes";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("AuthUser", ApiInvoker.parameterToString(authUser));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<FreePass>) ApiInvoker.deserialize(localVarResponse, "array", FreePass.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Lists all free passes
   * This end point returns the list of all free passes, including those that have been expired or revoked.
   * @param authUser    * @param authorization 
  */
  public void adminFreePassesGet (UUID authUser, String authorization, final Response.Listener<List<FreePass>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/admin/free-passes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("AuthUser", ApiInvoker.parameterToString(authUser));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<FreePass>) ApiInvoker.deserialize(localVarResponse,  "array", FreePass.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Search for users
  * 
   * @param body 
   * @param authUser 
   * @param authorization 
   * @return List<SearchResult>
  */
  public List<SearchResult> adminSearchPost (SearchQuery body, UUID authUser, String authorization) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling adminSearchPost",
        new ApiException(400, "Missing the required parameter 'body' when calling adminSearchPost"));
    }

    // create path and map variables
    String path = "/admin/search";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("AuthUser", ApiInvoker.parameterToString(authUser));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    String[] contentTypes = {
      "application/json;charset=utf-8"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<SearchResult>) ApiInvoker.deserialize(localVarResponse, "array", SearchResult.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Search for users
   * 
   * @param body    * @param authUser    * @param authorization 
  */
  public void adminSearchPost (SearchQuery body, UUID authUser, String authorization, final Response.Listener<List<SearchResult>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling adminSearchPost",
        new ApiException(400, "Missing the required parameter 'body' when calling adminSearchPost"));
    }

    // create path and map variables
    String path = "/admin/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("AuthUser", ApiInvoker.parameterToString(authUser));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));

    String[] contentTypes = {
      "application/json;charset=utf-8"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<SearchResult>) ApiInvoker.deserialize(localVarResponse,  "array", SearchResult.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Transfers passive customers from Kayak to Mailchimp
  * Passive subscribers/members/customers are users who don&#39;t have active entitlements and haven&#39;t opted out from email marketing. For the given list (audience) ID, this endpoint transfers the list of passive subscribers from Kayak to Mailchimp (via Faro).
   * @param listid 
   * @param authUser 
   * @param authorization 
   * @return Object
  */
  public Object adminTransferPassiveSubscribersListidPost (String listid, UUID authUser, String authorization) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'listid' is set
    if (listid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'listid' when calling adminTransferPassiveSubscribersListidPost",
        new ApiException(400, "Missing the required parameter 'listid' when calling adminTransferPassiveSubscribersListidPost"));
    }

    // create path and map variables
    String path = "/admin/transfer-passive-subscribers/{listid}".replaceAll("\\{" + "listid" + "\\}", apiInvoker.escapeString(listid.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("AuthUser", ApiInvoker.parameterToString(authUser));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Transfers passive customers from Kayak to Mailchimp
   * Passive subscribers/members/customers are users who don&#39;t have active entitlements and haven&#39;t opted out from email marketing. For the given list (audience) ID, this endpoint transfers the list of passive subscribers from Kayak to Mailchimp (via Faro).
   * @param listid    * @param authUser    * @param authorization 
  */
  public void adminTransferPassiveSubscribersListidPost (String listid, UUID authUser, String authorization, final Response.Listener<Object> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'listid' is set
    if (listid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'listid' when calling adminTransferPassiveSubscribersListidPost",
        new ApiException(400, "Missing the required parameter 'listid' when calling adminTransferPassiveSubscribersListidPost"));
    }

    // create path and map variables
    String path = "/admin/transfer-passive-subscribers/{listid}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "listid" + "\\}", apiInvoker.escapeString(listid.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("AuthUser", ApiInvoker.parameterToString(authUser));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Object) ApiInvoker.deserialize(localVarResponse,  "", Object.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Create a new user with admin options.
  * 
   * @param body 
   * @param authUser 
   * @param authorization 
   * @return LoginResponse
  */
  public LoginResponse adminUserPost (AdminNewUser body, UUID authUser, String authorization) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling adminUserPost",
        new ApiException(400, "Missing the required parameter 'body' when calling adminUserPost"));
    }

    // create path and map variables
    String path = "/admin/user";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("AuthUser", ApiInvoker.parameterToString(authUser));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    String[] contentTypes = {
      "application/json;charset=utf-8"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (LoginResponse) ApiInvoker.deserialize(localVarResponse, "", LoginResponse.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Create a new user with admin options.
   * 
   * @param body    * @param authUser    * @param authorization 
  */
  public void adminUserPost (AdminNewUser body, UUID authUser, String authorization, final Response.Listener<LoginResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling adminUserPost",
        new ApiException(400, "Missing the required parameter 'body' when calling adminUserPost"));
    }

    // create path and map variables
    String path = "/admin/user".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("AuthUser", ApiInvoker.parameterToString(authUser));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));

    String[] contentTypes = {
      "application/json;charset=utf-8"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((LoginResponse) ApiInvoker.deserialize(localVarResponse,  "", LoginResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}

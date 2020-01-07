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

package org.openapitools.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import org.openapitools.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("ActiveDays".equalsIgnoreCase(className)) {
      return new TypeToken<List<ActiveDays>>(){}.getType();
    }
    
    if ("Address".equalsIgnoreCase(className)) {
      return new TypeToken<List<Address>>(){}.getType();
    }
    
    if ("Campaign".equalsIgnoreCase(className)) {
      return new TypeToken<List<Campaign>>(){}.getType();
    }
    
    if ("CodeForTokenData".equalsIgnoreCase(className)) {
      return new TypeToken<List<CodeForTokenData>>(){}.getType();
    }
    
    if ("DeliveryAddress".equalsIgnoreCase(className)) {
      return new TypeToken<List<DeliveryAddress>>(){}.getType();
    }
    
    if ("DescriptionFrequency".equalsIgnoreCase(className)) {
      return new TypeToken<List<DescriptionFrequency>>(){}.getType();
    }
    
    if ("ForgotPasswordData".equalsIgnoreCase(className)) {
      return new TypeToken<List<ForgotPasswordData>>(){}.getType();
    }
    
    if ("ForgotPasswordResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ForgotPasswordResponse>>(){}.getType();
    }
    
    if ("GdprConsent".equalsIgnoreCase(className)) {
      return new TypeToken<List<GdprConsent>>(){}.getType();
    }
    
    if ("InlineResponse400".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse400>>(){}.getType();
    }
    
    if ("InlineResponse400InvalidRequestBody".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse400InvalidRequestBody>>(){}.getType();
    }
    
    if ("InlineResponse403".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse403>>(){}.getType();
    }
    
    if ("InlineResponse4031".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse4031>>(){}.getType();
    }
    
    if ("InlineResponse4031AccessTokenExpired".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse4031AccessTokenExpired>>(){}.getType();
    }
    
    if ("InlineResponse4032".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse4032>>(){}.getType();
    }
    
    if ("InlineResponse4032EmailAddressInUse".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse4032EmailAddressInUse>>(){}.getType();
    }
    
    if ("InlineResponse4032EmailNotAuthorized".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse4032EmailNotAuthorized>>(){}.getType();
    }
    
    if ("InlineResponse4032OauthFailed".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse4032OauthFailed>>(){}.getType();
    }
    
    if ("InlineResponse403InvalidCredentials".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse403InvalidCredentials>>(){}.getType();
    }
    
    if ("InlineResponse415".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse415>>(){}.getType();
    }
    
    if ("InlineResponse415UnsupportedMediaType".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse415UnsupportedMediaType>>(){}.getType();
    }
    
    if ("InlineResponse500".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse500>>(){}.getType();
    }
    
    if ("InlineResponse500InternalServerError".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse500InternalServerError>>(){}.getType();
    }
    
    if ("LegalConsent".equalsIgnoreCase(className)) {
      return new TypeToken<List<LegalConsent>>(){}.getType();
    }
    
    if ("LoginData".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoginData>>(){}.getType();
    }
    
    if ("LoginDataSSO".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoginDataSSO>>(){}.getType();
    }
    
    if ("LoginDataSoMe".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoginDataSoMe>>(){}.getType();
    }
    
    if ("LoginResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoginResponse>>(){}.getType();
    }
    
    if ("ModelPackage".equalsIgnoreCase(className)) {
      return new TypeToken<List<ModelPackage>>(){}.getType();
    }
    
    if ("NewUser".equalsIgnoreCase(className)) {
      return new TypeToken<List<NewUser>>(){}.getType();
    }
    
    if ("PackageDescription".equalsIgnoreCase(className)) {
      return new TypeToken<List<PackageDescription>>(){}.getType();
    }
    
    if ("PackageOffer".equalsIgnoreCase(className)) {
      return new TypeToken<List<PackageOffer>>(){}.getType();
    }
    
    if ("Paper".equalsIgnoreCase(className)) {
      return new TypeToken<List<Paper>>(){}.getType();
    }
    
    if ("PausedSubscription".equalsIgnoreCase(className)) {
      return new TypeToken<List<PausedSubscription>>(){}.getType();
    }
    
    if ("PendingAddressChange".equalsIgnoreCase(className)) {
      return new TypeToken<List<PendingAddressChange>>(){}.getType();
    }
    
    if ("Product".equalsIgnoreCase(className)) {
      return new TypeToken<List<Product>>(){}.getType();
    }
    
    if ("Subscription".equalsIgnoreCase(className)) {
      return new TypeToken<List<Subscription>>(){}.getType();
    }
    
    if ("SubscriptionDates".equalsIgnoreCase(className)) {
      return new TypeToken<List<SubscriptionDates>>(){}.getType();
    }
    
    if ("SubscriptionPauseDates".equalsIgnoreCase(className)) {
      return new TypeToken<List<SubscriptionPauseDates>>(){}.getType();
    }
    
    if ("TemporaryAddressChange".equalsIgnoreCase(className)) {
      return new TypeToken<List<TemporaryAddressChange>>(){}.getType();
    }
    
    if ("TokenResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TokenResponse>>(){}.getType();
    }
    
    if ("UpdatePasswordData".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdatePasswordData>>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<List<User>>(){}.getType();
    }
    
    if ("UserUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserUpdate>>(){}.getType();
    }
    
    if ("UserUpdateAddress".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserUpdateAddress>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("ActiveDays".equalsIgnoreCase(className)) {
      return new TypeToken<ActiveDays>(){}.getType();
    }
    
    if ("Address".equalsIgnoreCase(className)) {
      return new TypeToken<Address>(){}.getType();
    }
    
    if ("Campaign".equalsIgnoreCase(className)) {
      return new TypeToken<Campaign>(){}.getType();
    }
    
    if ("CodeForTokenData".equalsIgnoreCase(className)) {
      return new TypeToken<CodeForTokenData>(){}.getType();
    }
    
    if ("DeliveryAddress".equalsIgnoreCase(className)) {
      return new TypeToken<DeliveryAddress>(){}.getType();
    }
    
    if ("DescriptionFrequency".equalsIgnoreCase(className)) {
      return new TypeToken<DescriptionFrequency>(){}.getType();
    }
    
    if ("ForgotPasswordData".equalsIgnoreCase(className)) {
      return new TypeToken<ForgotPasswordData>(){}.getType();
    }
    
    if ("ForgotPasswordResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ForgotPasswordResponse>(){}.getType();
    }
    
    if ("GdprConsent".equalsIgnoreCase(className)) {
      return new TypeToken<GdprConsent>(){}.getType();
    }
    
    if ("InlineResponse400".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse400>(){}.getType();
    }
    
    if ("InlineResponse400InvalidRequestBody".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse400InvalidRequestBody>(){}.getType();
    }
    
    if ("InlineResponse403".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse403>(){}.getType();
    }
    
    if ("InlineResponse4031".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse4031>(){}.getType();
    }
    
    if ("InlineResponse4031AccessTokenExpired".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse4031AccessTokenExpired>(){}.getType();
    }
    
    if ("InlineResponse4032".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse4032>(){}.getType();
    }
    
    if ("InlineResponse4032EmailAddressInUse".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse4032EmailAddressInUse>(){}.getType();
    }
    
    if ("InlineResponse4032EmailNotAuthorized".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse4032EmailNotAuthorized>(){}.getType();
    }
    
    if ("InlineResponse4032OauthFailed".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse4032OauthFailed>(){}.getType();
    }
    
    if ("InlineResponse403InvalidCredentials".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse403InvalidCredentials>(){}.getType();
    }
    
    if ("InlineResponse415".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse415>(){}.getType();
    }
    
    if ("InlineResponse415UnsupportedMediaType".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse415UnsupportedMediaType>(){}.getType();
    }
    
    if ("InlineResponse500".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse500>(){}.getType();
    }
    
    if ("InlineResponse500InternalServerError".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse500InternalServerError>(){}.getType();
    }
    
    if ("LegalConsent".equalsIgnoreCase(className)) {
      return new TypeToken<LegalConsent>(){}.getType();
    }
    
    if ("LoginData".equalsIgnoreCase(className)) {
      return new TypeToken<LoginData>(){}.getType();
    }
    
    if ("LoginDataSSO".equalsIgnoreCase(className)) {
      return new TypeToken<LoginDataSSO>(){}.getType();
    }
    
    if ("LoginDataSoMe".equalsIgnoreCase(className)) {
      return new TypeToken<LoginDataSoMe>(){}.getType();
    }
    
    if ("LoginResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LoginResponse>(){}.getType();
    }
    
    if ("ModelPackage".equalsIgnoreCase(className)) {
      return new TypeToken<ModelPackage>(){}.getType();
    }
    
    if ("NewUser".equalsIgnoreCase(className)) {
      return new TypeToken<NewUser>(){}.getType();
    }
    
    if ("PackageDescription".equalsIgnoreCase(className)) {
      return new TypeToken<PackageDescription>(){}.getType();
    }
    
    if ("PackageOffer".equalsIgnoreCase(className)) {
      return new TypeToken<PackageOffer>(){}.getType();
    }
    
    if ("Paper".equalsIgnoreCase(className)) {
      return new TypeToken<Paper>(){}.getType();
    }
    
    if ("PausedSubscription".equalsIgnoreCase(className)) {
      return new TypeToken<PausedSubscription>(){}.getType();
    }
    
    if ("PendingAddressChange".equalsIgnoreCase(className)) {
      return new TypeToken<PendingAddressChange>(){}.getType();
    }
    
    if ("Product".equalsIgnoreCase(className)) {
      return new TypeToken<Product>(){}.getType();
    }
    
    if ("Subscription".equalsIgnoreCase(className)) {
      return new TypeToken<Subscription>(){}.getType();
    }
    
    if ("SubscriptionDates".equalsIgnoreCase(className)) {
      return new TypeToken<SubscriptionDates>(){}.getType();
    }
    
    if ("SubscriptionPauseDates".equalsIgnoreCase(className)) {
      return new TypeToken<SubscriptionPauseDates>(){}.getType();
    }
    
    if ("TemporaryAddressChange".equalsIgnoreCase(className)) {
      return new TypeToken<TemporaryAddressChange>(){}.getType();
    }
    
    if ("TokenResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TokenResponse>(){}.getType();
    }
    
    if ("UpdatePasswordData".equalsIgnoreCase(className)) {
      return new TypeToken<UpdatePasswordData>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<User>(){}.getType();
    }
    
    if ("UserUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<UserUpdate>(){}.getType();
    }
    
    if ("UserUpdateAddress".equalsIgnoreCase(className)) {
      return new TypeToken<UserUpdateAddress>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};

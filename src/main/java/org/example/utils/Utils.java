package org.example.utils;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.example.exception.AccountingSystemException;
import org.example.exception.ErrorCode;

public class Utils {

    private static final Gson gson = new Gson();

    public static <T> String getJsonFromClass(T response) {
        return gson.toJson(response);
    }

    public static <T> T getInstanceFromJson(String json, Class<T> tClass) throws AccountingSystemException {
        try {
            if (json == null || json.equals("")) {
                throw new AccountingSystemException(ErrorCode.WRONG_JSON);
            }
            return gson.fromJson(json, tClass);
        } catch (JsonSyntaxException e) {
            throw new AccountingSystemException(ErrorCode.WRONG_JSON);
        }
    }


}

package org.matiasnahuelheredia;
import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;
public class Main implements BurpExtension{

    @Override
    public void initialize(MontoyaApi montoyaApi) {
        montoyaApi.extension().setName("Web Cache Poisoning");
        montoyaApi.logging().logToError("Web Cache Poisoning");
    }

}
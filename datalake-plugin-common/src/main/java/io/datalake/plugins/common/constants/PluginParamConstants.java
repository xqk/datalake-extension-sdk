package io.datalake.plugins.common.constants;

public interface PluginParamConstants {

    String getValue();

    public enum Type implements PluginParamConstants {

        PASSWORD("password"),
        TEXT("text"),
        JSON("json");

        private String value;

        Type(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public enum Classify implements PluginParamConstants {
        MAIL("smtp"),
        BASE("base"),
        LDAP("ldap"),
        REGISTRY("registry");

        private String value;

        Classify(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }


    public enum Registry implements PluginParamConstants {
        URL("registry.url"),
        REPO("registry.repo"),
        USERNAME("registry.username"),
        PASSWORD("registry.password");

        private String value;

        Registry(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    public enum I18n implements PluginParamConstants {

        LANGUAGE("i18n.language");

        private String value;

        I18n(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    enum MAIL implements PluginParamConstants{
        SERVER("smtp.host"),
        PORT("smtp.port"),
        ACCOUNT("smtp.account"),
        PASSWORD("smtp.password"),
        SSL("smtp.ssl"),
        TLS("smtp.tls"),
        RECIPIENTS("smtp.recipient");

        private String value;

        private MAIL(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    public enum BASE implements PluginParamConstants {
        URL("base.url"),
        CONCURRENCY("base.concurrency"),
        PROMETHEUS_HOST("base.prometheus.host");

        private String value;

        private BASE(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    public enum LDAP implements PluginParamConstants {
        URL("ldap.url"),
        DN("ldap.dn"),
        PASSWORD("ldap.password"),
        OU("ldap.ou"),
        FILTER("ldap.filter"),
        MAPPING("ldap.mapping"),
        OPEN("ldap.open");

        private String value;

        LDAP(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }
    }
    
}

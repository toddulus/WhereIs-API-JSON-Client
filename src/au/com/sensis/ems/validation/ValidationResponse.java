package au.com.sensis.ems.validation;

import au.com.sensis.ems.types.GeocodedAddress;
import au.com.sensis.ems.types.Pagination;

public class ValidationResponse {

        private ValidationResponseElement[] results;

        private Pagination pagination;
        
        /**
         * @return the results
         */
        public ValidationResponseElement[] getResults() {
            return results;
        }

        /**
         * @param results the results to set
         */
        public void setResults(ValidationResponseElement[] results) {
            this.results = results;
        }

        /**
         * @return the pagination
         */
        public Pagination getPagination() {
            return pagination;
        }

        /**
         * @param pagination the pagination to set
         */
        public void setPagination(Pagination pagination) {
            this.pagination = pagination;
        }

        public class ValidationResponseElement {

            private String[] adjustments;
            private GeocodedAddress geocodedAddress;
            /**
             * @return the adjustments
             */
            public String[] getAdjustments() {
                return adjustments;
            }
            /**
             * @param adjustments the adjustments to set
             */
            public void setAdjustments(String[] adjustments) {
                this.adjustments = adjustments;
            }
            /**
             * @return the geocodedAddress
             */
            public GeocodedAddress getGeocodedAddress() {
                return geocodedAddress;
            }
            /**
             * @param geocodedAddress the geocodedAddress to set
             */
            public void setGeocodedAddress(GeocodedAddress geocodedAddress) {
                this.geocodedAddress = geocodedAddress;
            }
        }
}

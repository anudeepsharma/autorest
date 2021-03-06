/**
 */

package petstore.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CheckNameAvailability operation response.
 */
public class CheckNameAvailabilityResult {
    /**
     * Gets a boolean value that indicates whether the name is available for
     * you to use. If true, the name is available. If false, the name has
     * already been taken or invalid and cannot be used.
     */
    @JsonProperty(value = "nameAvailable")
    private Boolean nameAvailable;

    /**
     * Gets the reason that a storage account name could not be used. The
     * Reason element is only returned if NameAvailable is false. Possible
     * values include: 'AccountNameInvalid', 'AlreadyExists'.
     */
    @JsonProperty(value = "reason")
    private Reason reason;

    /**
     * Gets an error message explaining the Reason value in more detail.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the nameAvailable value.
     *
     * @return the nameAvailable value
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable value.
     *
     * @param nameAvailable the nameAvailable value to set
     * @return the CheckNameAvailabilityResult object itself.
     */
    public CheckNameAvailabilityResult withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason value.
     *
     * @return the reason value
     */
    public Reason reason() {
        return this.reason;
    }

    /**
     * Set the reason value.
     *
     * @param reason the reason value to set
     * @return the CheckNameAvailabilityResult object itself.
     */
    public CheckNameAvailabilityResult withReason(Reason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the CheckNameAvailabilityResult object itself.
     */
    public CheckNameAvailabilityResult withMessage(String message) {
        this.message = message;
        return this;
    }

}

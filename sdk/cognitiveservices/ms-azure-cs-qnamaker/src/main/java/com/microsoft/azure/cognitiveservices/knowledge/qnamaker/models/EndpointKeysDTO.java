/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema for EndpointKeys generate/refresh operations.
 */
public class EndpointKeysDTO {
    /**
     * Primary Access Key.
     */
    @JsonProperty(value = "primaryEndpointKey")
    private String primaryEndpointKey;

    /**
     * Secondary Access Key.
     */
    @JsonProperty(value = "secondaryEndpointKey")
    private String secondaryEndpointKey;

    /**
     * Current version of runtime.
     */
    @JsonProperty(value = "installedVersion")
    private String installedVersion;

    /**
     * Latest version of runtime.
     */
    @JsonProperty(value = "lastStableVersion")
    private String lastStableVersion;

    /**
     * Language setting of runtime.
     */
    @JsonProperty(value = "language")
    private String language;

    /**
     * Get the primaryEndpointKey value.
     *
     * @return the primaryEndpointKey value
     */
    public String primaryEndpointKey() {
        return this.primaryEndpointKey;
    }

    /**
     * Set the primaryEndpointKey value.
     *
     * @param primaryEndpointKey the primaryEndpointKey value to set
     * @return the EndpointKeysDTO object itself.
     */
    public EndpointKeysDTO withPrimaryEndpointKey(String primaryEndpointKey) {
        this.primaryEndpointKey = primaryEndpointKey;
        return this;
    }

    /**
     * Get the secondaryEndpointKey value.
     *
     * @return the secondaryEndpointKey value
     */
    public String secondaryEndpointKey() {
        return this.secondaryEndpointKey;
    }

    /**
     * Set the secondaryEndpointKey value.
     *
     * @param secondaryEndpointKey the secondaryEndpointKey value to set
     * @return the EndpointKeysDTO object itself.
     */
    public EndpointKeysDTO withSecondaryEndpointKey(String secondaryEndpointKey) {
        this.secondaryEndpointKey = secondaryEndpointKey;
        return this;
    }

    /**
     * Get the installedVersion value.
     *
     * @return the installedVersion value
     */
    public String installedVersion() {
        return this.installedVersion;
    }

    /**
     * Set the installedVersion value.
     *
     * @param installedVersion the installedVersion value to set
     * @return the EndpointKeysDTO object itself.
     */
    public EndpointKeysDTO withInstalledVersion(String installedVersion) {
        this.installedVersion = installedVersion;
        return this;
    }

    /**
     * Get the lastStableVersion value.
     *
     * @return the lastStableVersion value
     */
    public String lastStableVersion() {
        return this.lastStableVersion;
    }

    /**
     * Set the lastStableVersion value.
     *
     * @param lastStableVersion the lastStableVersion value to set
     * @return the EndpointKeysDTO object itself.
     */
    public EndpointKeysDTO withLastStableVersion(String lastStableVersion) {
        this.lastStableVersion = lastStableVersion;
        return this;
    }

    /**
     * Get the language value.
     *
     * @return the language value
     */
    public String language() {
        return this.language;
    }

    /**
     * Set the language value.
     *
     * @param language the language value to set
     * @return the EndpointKeysDTO object itself.
     */
    public EndpointKeysDTO withLanguage(String language) {
        this.language = language;
        return this;
    }

}
/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package sh.ory.client-kotlin-multiplatform.models


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param accent 
 * @param bgDefault 
 * @param borderRadiusBranding 
 * @param borderRadiusButtons 
 * @param borderRadiusCards 
 * @param borderRadiusForms 
 * @param borderRadiusGeneral 
 * @param buttonPrimaryBgDefault 
 * @param buttonPrimaryBgDisabled 
 * @param buttonPrimaryBgHover 
 * @param buttonPrimaryBorderDefault 
 * @param buttonPrimaryBorderDisabled 
 * @param buttonPrimaryBorderHover 
 * @param buttonPrimaryFgDefault 
 * @param buttonPrimaryFgDisabled 
 * @param buttonPrimaryFgHover 
 * @param buttonSecondaryBgDefault 
 * @param buttonSecondaryBgDisabled 
 * @param buttonSecondaryBgHover 
 * @param buttonSecondaryBorderDefault 
 * @param buttonSecondaryBorderDisabled 
 * @param buttonSecondaryBorderHover 
 * @param buttonSecondaryFgDefault 
 * @param buttonSecondaryFgDisabled 
 * @param buttonSecondaryFgHover 
 * @param buttonSocialBgDefault 
 * @param buttonSocialBgDisabled 
 * @param buttonSocialBgHover 
 * @param buttonSocialBgProvider 
 * @param buttonSocialBorderDefault 
 * @param buttonSocialBorderDisabled 
 * @param buttonSocialBorderHover 
 * @param buttonSocialBorderProvider 
 * @param buttonSocialFgDefault 
 * @param buttonSocialFgDisabled 
 * @param buttonSocialFgHover 
 * @param buttonSocialFgProvider 
 * @param createdAt 
 * @param dialogBgDefault 
 * @param dialogBgSubtle 
 * @param dialogBorderDefault 
 * @param dialogFgDefault 
 * @param dialogFgMute 
 * @param dialogFgSubtle 
 * @param formsBgDefault 
 * @param formsBgDisabled 
 * @param formsBgHover 
 * @param formsBorderDefault 
 * @param formsBorderDisabled 
 * @param formsBorderError 
 * @param formsBorderFocus 
 * @param formsBorderHover 
 * @param formsBorderSuccess 
 * @param formsBorderWarn 
 * @param formsCheckboxBgChecked 
 * @param formsCheckboxBgDefault 
 * @param formsCheckboxBorderChecked 
 * @param formsCheckboxBorderDefault 
 * @param formsCheckboxFgChecked 
 * @param formsCheckboxFgDefault 
 * @param formsFgDefault 
 * @param formsFgError 
 * @param formsFgMute 
 * @param formsFgSubtle 
 * @param formsFgSuccess 
 * @param formsFgWarn 
 * @param formsRadioBgChecked 
 * @param formsRadioBgDefault 
 * @param formsRadioBorderChecked 
 * @param formsRadioBorderDefault 
 * @param formsRadioFgChecked 
 * @param formsRadioFgDefault 
 * @param formsToggleBgChecked 
 * @param formsToggleBgDefault 
 * @param formsToggleBorderChecked 
 * @param formsToggleBorderDefault 
 * @param formsToggleFgChecked 
 * @param formsToggleFgDefault 
 * @param id 
 * @param linksLinkDefault 
 * @param linksLinkDisabled 
 * @param linksLinkHover 
 * @param linksLinkInvertedDefault 
 * @param linksLinkInvertedHover 
 * @param linksLinkMuteDefault 
 * @param linksLinkMuteHover 
 * @param syntaxSyntax 
 * @param syntaxSyntaxKey 
 * @param syntaxSyntaxNum 
 * @param syntaxSyntaxValue 
 * @param updatedAt 
 */
@Serializable

data class AccountExperienceThemeVariables (

    @SerialName(value = "accent") val accent: kotlin.String? = null,

    @SerialName(value = "bg-default") val bgDefault: kotlin.String? = null,

    @SerialName(value = "border-radius-branding") val borderRadiusBranding: kotlin.String? = null,

    @SerialName(value = "border-radius-buttons") val borderRadiusButtons: kotlin.String? = null,

    @SerialName(value = "border-radius-cards") val borderRadiusCards: kotlin.String? = null,

    @SerialName(value = "border-radius-forms") val borderRadiusForms: kotlin.String? = null,

    @SerialName(value = "border-radius-general") val borderRadiusGeneral: kotlin.String? = null,

    @SerialName(value = "button-primary-bg-default") val buttonPrimaryBgDefault: kotlin.String? = null,

    @SerialName(value = "button-primary-bg-disabled") val buttonPrimaryBgDisabled: kotlin.String? = null,

    @SerialName(value = "button-primary-bg-hover") val buttonPrimaryBgHover: kotlin.String? = null,

    @SerialName(value = "button-primary-border-default") val buttonPrimaryBorderDefault: kotlin.String? = null,

    @SerialName(value = "button-primary-border-disabled") val buttonPrimaryBorderDisabled: kotlin.String? = null,

    @SerialName(value = "button-primary-border-hover") val buttonPrimaryBorderHover: kotlin.String? = null,

    @SerialName(value = "button-primary-fg-default") val buttonPrimaryFgDefault: kotlin.String? = null,

    @SerialName(value = "button-primary-fg-disabled") val buttonPrimaryFgDisabled: kotlin.String? = null,

    @SerialName(value = "button-primary-fg-hover") val buttonPrimaryFgHover: kotlin.String? = null,

    @SerialName(value = "button-secondary-bg-default") val buttonSecondaryBgDefault: kotlin.String? = null,

    @SerialName(value = "button-secondary-bg-disabled") val buttonSecondaryBgDisabled: kotlin.String? = null,

    @SerialName(value = "button-secondary-bg-hover") val buttonSecondaryBgHover: kotlin.String? = null,

    @SerialName(value = "button-secondary-border-default") val buttonSecondaryBorderDefault: kotlin.String? = null,

    @SerialName(value = "button-secondary-border-disabled") val buttonSecondaryBorderDisabled: kotlin.String? = null,

    @SerialName(value = "button-secondary-border-hover") val buttonSecondaryBorderHover: kotlin.String? = null,

    @SerialName(value = "button-secondary-fg-default") val buttonSecondaryFgDefault: kotlin.String? = null,

    @SerialName(value = "button-secondary-fg-disabled") val buttonSecondaryFgDisabled: kotlin.String? = null,

    @SerialName(value = "button-secondary-fg-hover") val buttonSecondaryFgHover: kotlin.String? = null,

    @SerialName(value = "button-social-bg-default") val buttonSocialBgDefault: kotlin.String? = null,

    @SerialName(value = "button-social-bg-disabled") val buttonSocialBgDisabled: kotlin.String? = null,

    @SerialName(value = "button-social-bg-hover") val buttonSocialBgHover: kotlin.String? = null,

    @SerialName(value = "button-social-bg-provider") val buttonSocialBgProvider: kotlin.String? = null,

    @SerialName(value = "button-social-border-default") val buttonSocialBorderDefault: kotlin.String? = null,

    @SerialName(value = "button-social-border-disabled") val buttonSocialBorderDisabled: kotlin.String? = null,

    @SerialName(value = "button-social-border-hover") val buttonSocialBorderHover: kotlin.String? = null,

    @SerialName(value = "button-social-border-provider") val buttonSocialBorderProvider: kotlin.String? = null,

    @SerialName(value = "button-social-fg-default") val buttonSocialFgDefault: kotlin.String? = null,

    @SerialName(value = "button-social-fg-disabled") val buttonSocialFgDisabled: kotlin.String? = null,

    @SerialName(value = "button-social-fg-hover") val buttonSocialFgHover: kotlin.String? = null,

    @SerialName(value = "button-social-fg-provider") val buttonSocialFgProvider: kotlin.String? = null,

    @SerialName(value = "created_at") val createdAt: kotlinx.datetime.Instant? = null,

    @SerialName(value = "dialog-bg-default") val dialogBgDefault: kotlin.String? = null,

    @SerialName(value = "dialog-bg-subtle") val dialogBgSubtle: kotlin.String? = null,

    @SerialName(value = "dialog-border-default") val dialogBorderDefault: kotlin.String? = null,

    @SerialName(value = "dialog-fg-default") val dialogFgDefault: kotlin.String? = null,

    @SerialName(value = "dialog-fg-mute") val dialogFgMute: kotlin.String? = null,

    @SerialName(value = "dialog-fg-subtle") val dialogFgSubtle: kotlin.String? = null,

    @SerialName(value = "forms-bg-default") val formsBgDefault: kotlin.String? = null,

    @SerialName(value = "forms-bg-disabled") val formsBgDisabled: kotlin.String? = null,

    @SerialName(value = "forms-bg-hover") val formsBgHover: kotlin.String? = null,

    @SerialName(value = "forms-border-default") val formsBorderDefault: kotlin.String? = null,

    @SerialName(value = "forms-border-disabled") val formsBorderDisabled: kotlin.String? = null,

    @SerialName(value = "forms-border-error") val formsBorderError: kotlin.String? = null,

    @SerialName(value = "forms-border-focus") val formsBorderFocus: kotlin.String? = null,

    @SerialName(value = "forms-border-hover") val formsBorderHover: kotlin.String? = null,

    @SerialName(value = "forms-border-success") val formsBorderSuccess: kotlin.String? = null,

    @SerialName(value = "forms-border-warn") val formsBorderWarn: kotlin.String? = null,

    @SerialName(value = "forms-checkbox-bg-checked") val formsCheckboxBgChecked: kotlin.String? = null,

    @SerialName(value = "forms-checkbox-bg-default") val formsCheckboxBgDefault: kotlin.String? = null,

    @SerialName(value = "forms-checkbox-border-checked") val formsCheckboxBorderChecked: kotlin.String? = null,

    @SerialName(value = "forms-checkbox-border-default") val formsCheckboxBorderDefault: kotlin.String? = null,

    @SerialName(value = "forms-checkbox-fg-checked") val formsCheckboxFgChecked: kotlin.String? = null,

    @SerialName(value = "forms-checkbox-fg-default") val formsCheckboxFgDefault: kotlin.String? = null,

    @SerialName(value = "forms-fg-default") val formsFgDefault: kotlin.String? = null,

    @SerialName(value = "forms-fg-error") val formsFgError: kotlin.String? = null,

    @SerialName(value = "forms-fg-mute") val formsFgMute: kotlin.String? = null,

    @SerialName(value = "forms-fg-subtle") val formsFgSubtle: kotlin.String? = null,

    @SerialName(value = "forms-fg-success") val formsFgSuccess: kotlin.String? = null,

    @SerialName(value = "forms-fg-warn") val formsFgWarn: kotlin.String? = null,

    @SerialName(value = "forms-radio-bg-checked") val formsRadioBgChecked: kotlin.String? = null,

    @SerialName(value = "forms-radio-bg-default") val formsRadioBgDefault: kotlin.String? = null,

    @SerialName(value = "forms-radio-border-checked") val formsRadioBorderChecked: kotlin.String? = null,

    @SerialName(value = "forms-radio-border-default") val formsRadioBorderDefault: kotlin.String? = null,

    @SerialName(value = "forms-radio-fg-checked") val formsRadioFgChecked: kotlin.String? = null,

    @SerialName(value = "forms-radio-fg-default") val formsRadioFgDefault: kotlin.String? = null,

    @SerialName(value = "forms-toggle-bg-checked") val formsToggleBgChecked: kotlin.String? = null,

    @SerialName(value = "forms-toggle-bg-default") val formsToggleBgDefault: kotlin.String? = null,

    @SerialName(value = "forms-toggle-border-checked") val formsToggleBorderChecked: kotlin.String? = null,

    @SerialName(value = "forms-toggle-border-default") val formsToggleBorderDefault: kotlin.String? = null,

    @SerialName(value = "forms-toggle-fg-checked") val formsToggleFgChecked: kotlin.String? = null,

    @SerialName(value = "forms-toggle-fg-default") val formsToggleFgDefault: kotlin.String? = null,

    @SerialName(value = "id") val id: kotlin.String? = null,

    @SerialName(value = "links-link-default") val linksLinkDefault: kotlin.String? = null,

    @SerialName(value = "links-link-disabled") val linksLinkDisabled: kotlin.String? = null,

    @SerialName(value = "links-link-hover") val linksLinkHover: kotlin.String? = null,

    @SerialName(value = "links-link-inverted-default") val linksLinkInvertedDefault: kotlin.String? = null,

    @SerialName(value = "links-link-inverted-hover") val linksLinkInvertedHover: kotlin.String? = null,

    @SerialName(value = "links-link-mute-default") val linksLinkMuteDefault: kotlin.String? = null,

    @SerialName(value = "links-link-mute-hover") val linksLinkMuteHover: kotlin.String? = null,

    @SerialName(value = "syntax-syntax") val syntaxSyntax: kotlin.String? = null,

    @SerialName(value = "syntax-syntax-key") val syntaxSyntaxKey: kotlin.String? = null,

    @SerialName(value = "syntax-syntax-num") val syntaxSyntaxNum: kotlin.String? = null,

    @SerialName(value = "syntax-syntax-value") val syntaxSyntaxValue: kotlin.String? = null,

    @SerialName(value = "updated_at") val updatedAt: kotlinx.datetime.Instant? = null

) {


}


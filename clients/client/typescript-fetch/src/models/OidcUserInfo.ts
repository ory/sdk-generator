/* tslint:disable */
/* eslint-disable */
/**
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.15.0
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * OpenID Connect Userinfo
 * @export
 * @interface OidcUserInfo
 */
export interface OidcUserInfo {
    /**
     * End-User's birthday, represented as an ISO 8601:2004 [ISO8601‑2004] YYYY-MM-DD format. The year MAY be 0000, indicating that it is omitted. To represent only the year, YYYY format is allowed. Note that depending on the underlying platform's date related function, providing just year can result in varying month and day, so the implementers need to take this factor into account to correctly process the dates.
     * @type {string}
     * @memberof OidcUserInfo
     */
    birthdate?: string;
    /**
     * End-User's preferred e-mail address. Its value MUST conform to the RFC 5322 [RFC5322] addr-spec syntax. The RP MUST NOT rely upon this value being unique, as discussed in Section 5.7.
     * @type {string}
     * @memberof OidcUserInfo
     */
    email?: string;
    /**
     * True if the End-User's e-mail address has been verified; otherwise false. When this Claim Value is true, this means that the OP took affirmative steps to ensure that this e-mail address was controlled by the End-User at the time the verification was performed. The means by which an e-mail address is verified is context-specific, and dependent upon the trust framework or contractual agreements within which the parties are operating.
     * @type {boolean}
     * @memberof OidcUserInfo
     */
    email_verified?: boolean;
    /**
     * Surname(s) or last name(s) of the End-User. Note that in some cultures, people can have multiple family names or no family name; all can be present, with the names being separated by space characters.
     * @type {string}
     * @memberof OidcUserInfo
     */
    family_name?: string;
    /**
     * End-User's gender. Values defined by this specification are female and male. Other values MAY be used when neither of the defined values are applicable.
     * @type {string}
     * @memberof OidcUserInfo
     */
    gender?: string;
    /**
     * Given name(s) or first name(s) of the End-User. Note that in some cultures, people can have multiple given names; all can be present, with the names being separated by space characters.
     * @type {string}
     * @memberof OidcUserInfo
     */
    given_name?: string;
    /**
     * End-User's locale, represented as a BCP47 [RFC5646] language tag. This is typically an ISO 639-1 Alpha-2 [ISO639‑1] language code in lowercase and an ISO 3166-1 Alpha-2 [ISO3166‑1] country code in uppercase, separated by a dash. For example, en-US or fr-CA. As a compatibility note, some implementations have used an underscore as the separator rather than a dash, for example, en_US; Relying Parties MAY choose to accept this locale syntax as well.
     * @type {string}
     * @memberof OidcUserInfo
     */
    locale?: string;
    /**
     * Middle name(s) of the End-User. Note that in some cultures, people can have multiple middle names; all can be present, with the names being separated by space characters. Also note that in some cultures, middle names are not used.
     * @type {string}
     * @memberof OidcUserInfo
     */
    middle_name?: string;
    /**
     * End-User's full name in displayable form including all name parts, possibly including titles and suffixes, ordered according to the End-User's locale and preferences.
     * @type {string}
     * @memberof OidcUserInfo
     */
    name?: string;
    /**
     * Casual name of the End-User that may or may not be the same as the given_name. For instance, a nickname value of Mike might be returned alongside a given_name value of Michael.
     * @type {string}
     * @memberof OidcUserInfo
     */
    nickname?: string;
    /**
     * End-User's preferred telephone number. E.164 [E.164] is RECOMMENDED as the format of this Claim, for example, +1 (425) 555-1212 or +56 (2) 687 2400. If the phone number contains an extension, it is RECOMMENDED that the extension be represented using the RFC 3966 [RFC3966] extension syntax, for example, +1 (604) 555-1234;ext=5678.
     * @type {string}
     * @memberof OidcUserInfo
     */
    phone_number?: string;
    /**
     * True if the End-User's phone number has been verified; otherwise false. When this Claim Value is true, this means that the OP took affirmative steps to ensure that this phone number was controlled by the End-User at the time the verification was performed. The means by which a phone number is verified is context-specific, and dependent upon the trust framework or contractual agreements within which the parties are operating. When true, the phone_number Claim MUST be in E.164 format and any extensions MUST be represented in RFC 3966 format.
     * @type {boolean}
     * @memberof OidcUserInfo
     */
    phone_number_verified?: boolean;
    /**
     * URL of the End-User's profile picture. This URL MUST refer to an image file (for example, a PNG, JPEG, or GIF image file), rather than to a Web page containing an image. Note that this URL SHOULD specifically reference a profile photo of the End-User suitable for displaying when describing the End-User, rather than an arbitrary photo taken by the End-User.
     * @type {string}
     * @memberof OidcUserInfo
     */
    picture?: string;
    /**
     * Non-unique shorthand name by which the End-User wishes to be referred to at the RP, such as janedoe or j.doe. This value MAY be any valid JSON string including special characters such as @, /, or whitespace.
     * @type {string}
     * @memberof OidcUserInfo
     */
    preferred_username?: string;
    /**
     * URL of the End-User's profile page. The contents of this Web page SHOULD be about the End-User.
     * @type {string}
     * @memberof OidcUserInfo
     */
    profile?: string;
    /**
     * Subject - Identifier for the End-User at the IssuerURL.
     * @type {string}
     * @memberof OidcUserInfo
     */
    sub?: string;
    /**
     * Time the End-User's information was last updated. Its value is a JSON number representing the number of seconds from 1970-01-01T0:0:0Z as measured in UTC until the date/time.
     * @type {number}
     * @memberof OidcUserInfo
     */
    updated_at?: number;
    /**
     * URL of the End-User's Web page or blog. This Web page SHOULD contain information published by the End-User or an organization that the End-User is affiliated with.
     * @type {string}
     * @memberof OidcUserInfo
     */
    website?: string;
    /**
     * String from zoneinfo [zoneinfo] time zone database representing the End-User's time zone. For example, Europe/Paris or America/Los_Angeles.
     * @type {string}
     * @memberof OidcUserInfo
     */
    zoneinfo?: string;
}

/**
 * Check if a given object implements the OidcUserInfo interface.
 */
export function instanceOfOidcUserInfo(value: object): value is OidcUserInfo {
    return true;
}

export function OidcUserInfoFromJSON(json: any): OidcUserInfo {
    return OidcUserInfoFromJSONTyped(json, false);
}

export function OidcUserInfoFromJSONTyped(json: any, ignoreDiscriminator: boolean): OidcUserInfo {
    if (json == null) {
        return json;
    }
    return {
        
        'birthdate': json['birthdate'] == null ? undefined : json['birthdate'],
        'email': json['email'] == null ? undefined : json['email'],
        'email_verified': json['email_verified'] == null ? undefined : json['email_verified'],
        'family_name': json['family_name'] == null ? undefined : json['family_name'],
        'gender': json['gender'] == null ? undefined : json['gender'],
        'given_name': json['given_name'] == null ? undefined : json['given_name'],
        'locale': json['locale'] == null ? undefined : json['locale'],
        'middle_name': json['middle_name'] == null ? undefined : json['middle_name'],
        'name': json['name'] == null ? undefined : json['name'],
        'nickname': json['nickname'] == null ? undefined : json['nickname'],
        'phone_number': json['phone_number'] == null ? undefined : json['phone_number'],
        'phone_number_verified': json['phone_number_verified'] == null ? undefined : json['phone_number_verified'],
        'picture': json['picture'] == null ? undefined : json['picture'],
        'preferred_username': json['preferred_username'] == null ? undefined : json['preferred_username'],
        'profile': json['profile'] == null ? undefined : json['profile'],
        'sub': json['sub'] == null ? undefined : json['sub'],
        'updated_at': json['updated_at'] == null ? undefined : json['updated_at'],
        'website': json['website'] == null ? undefined : json['website'],
        'zoneinfo': json['zoneinfo'] == null ? undefined : json['zoneinfo'],
    };
}

export function OidcUserInfoToJSON(value?: OidcUserInfo | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'birthdate': value['birthdate'],
        'email': value['email'],
        'email_verified': value['email_verified'],
        'family_name': value['family_name'],
        'gender': value['gender'],
        'given_name': value['given_name'],
        'locale': value['locale'],
        'middle_name': value['middle_name'],
        'name': value['name'],
        'nickname': value['nickname'],
        'phone_number': value['phone_number'],
        'phone_number_verified': value['phone_number_verified'],
        'picture': value['picture'],
        'preferred_username': value['preferred_username'],
        'profile': value['profile'],
        'sub': value['sub'],
        'updated_at': value['updated_at'],
        'website': value['website'],
        'zoneinfo': value['zoneinfo'],
    };
}


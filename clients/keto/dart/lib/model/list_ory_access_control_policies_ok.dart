//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ListOryAccessControlPoliciesOK {
  /// Returns a new [ListOryAccessControlPoliciesOK] instance.
  ListOryAccessControlPoliciesOK({
    this.payload = const [],
  });

  /// payload
  List<OryAccessControlPolicy> payload;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ListOryAccessControlPoliciesOK &&
     other.payload == payload;

  @override
  int get hashCode =>
    (payload == null ? 0 : payload.hashCode);

  @override
  String toString() => 'ListOryAccessControlPoliciesOK[payload=$payload]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (payload != null) {
      json[r'Payload'] = payload;
    }
    return json;
  }

  /// Returns a new [ListOryAccessControlPoliciesOK] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static ListOryAccessControlPoliciesOK fromJson(Map<String, dynamic> json) => json == null
    ? null
    : ListOryAccessControlPoliciesOK(
        payload: OryAccessControlPolicy.listFromJson(json[r'Payload']),
    );

  static List<ListOryAccessControlPoliciesOK> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <ListOryAccessControlPoliciesOK>[]
      : json.map((v) => ListOryAccessControlPoliciesOK.fromJson(v)).toList(growable: true == growable);

  static Map<String, ListOryAccessControlPoliciesOK> mapFromJson(Map<String, dynamic> json) {
    final map = <String, ListOryAccessControlPoliciesOK>{};
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic v) => map[key] = ListOryAccessControlPoliciesOK.fromJson(v));
    }
    return map;
  }

  // maps a json object with a list of ListOryAccessControlPoliciesOK-objects as value to a dart map
  static Map<String, List<ListOryAccessControlPoliciesOK>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<ListOryAccessControlPoliciesOK>>{};
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic v) {
        map[key] = ListOryAccessControlPoliciesOK.listFromJson(v, emptyIsNull: emptyIsNull, growable: growable);
      });
    }
    return map;
  }
}


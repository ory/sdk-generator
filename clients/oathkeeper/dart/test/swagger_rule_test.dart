import 'package:ory_oathkeeper_client/api.dart';
import 'package:test/test.dart';

// tests for SwaggerRule
void main() {
  final instance = SwaggerRule();

  group('test SwaggerRule', () {
    // Authenticators is a list of authentication handlers that will try and authenticate the provided credentials. Authenticators are checked iteratively from index 0 to n and if the first authenticator to return a positive result will be the one used.  If you want the rule to first check a specific authenticator  before \"falling back\" to others, have that authenticator as the first item in the array.
    // List<SwaggerRuleHandler> authenticators (default value: const [])
    test('to test the property `authenticators`', () async {
      // TODO
    });

    // SwaggerRuleHandler authorizer
    test('to test the property `authorizer`', () async {
      // TODO
    });

    // Description is a human readable description of this rule.
    // String description
    test('to test the property `description`', () async {
      // TODO
    });

    // ID is the unique id of the rule. It can be at most 190 characters long, but the layout of the ID is up to you. You will need this ID later on to update or delete the rule.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // SwaggerRuleMatch match
    test('to test the property `match`', () async {
      // TODO
    });

    // Mutators is a list of mutation handlers that transform the HTTP request. A common use case is generating a new set of credentials (e.g. JWT) which then will be forwarded to the upstream server.  Mutations are performed iteratively from index 0 to n and should all succeed in order for the HTTP request to be forwarded.
    // List<SwaggerRuleHandler> mutators (default value: const [])
    test('to test the property `mutators`', () async {
      // TODO
    });

    // Upstream upstream
    test('to test the property `upstream`', () async {
      // TODO
    });


  });

}

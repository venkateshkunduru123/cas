package org.apereo.cas.uma;

import org.apereo.cas.uma.discovery.UmaServerDiscoverySettingsFactoryTests;
import org.apereo.cas.uma.web.controllers.authz.UmaAuthorizationRequestEndpointControllerTests;
import org.apereo.cas.uma.web.controllers.claims.DefaultUmaResourceSetClaimPermissionExaminerTests;
import org.apereo.cas.uma.web.controllers.claims.UmaRequestingPartyClaimsCollectionEndpointControllerTests;
import org.apereo.cas.uma.web.controllers.permission.UmaPermissionRegistrationEndpointControllerTests;
import org.apereo.cas.uma.web.controllers.policy.UmaCreatePolicyForResourceSetEndpointControllerTests;
import org.apereo.cas.uma.web.controllers.policy.UmaDeletePolicyForResourceSetEndpointControllerTests;
import org.apereo.cas.uma.web.controllers.policy.UmaFindPolicyForResourceSetEndpointControllerTests;
import org.apereo.cas.uma.web.controllers.policy.UmaUpdatePolicyForResourceSetEndpointControllerTests;
import org.apereo.cas.uma.web.controllers.resource.UmaCreateResourceSetRegistrationEndpointControllerTests;
import org.apereo.cas.uma.web.controllers.resource.UmaDeleteResourceSetRegistrationEndpointControllerTests;
import org.apereo.cas.uma.web.controllers.resource.UmaFindResourceSetRegistrationEndpointControllerTests;
import org.apereo.cas.uma.web.controllers.resource.UmaUpdateResourceSetRegistrationEndpointControllerTests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
 * This is {@link UmaTestsSuite}.
 *
 * @author Misagh Moayyed
 * @since 6.0.0
 */
@SelectClasses({
    UmaServerDiscoverySettingsFactoryTests.class,
    DefaultUmaResourceSetClaimPermissionExaminerTests.class,
    UmaPermissionRegistrationEndpointControllerTests.class,
    UmaCreateResourceSetRegistrationEndpointControllerTests.class,
    UmaDeleteResourceSetRegistrationEndpointControllerTests.class,
    UmaFindResourceSetRegistrationEndpointControllerTests.class,
    UmaUpdateResourceSetRegistrationEndpointControllerTests.class,
    UmaCreatePolicyForResourceSetEndpointControllerTests.class,
    UmaDeletePolicyForResourceSetEndpointControllerTests.class,
    UmaFindPolicyForResourceSetEndpointControllerTests.class,
    UmaUpdatePolicyForResourceSetEndpointControllerTests.class,
    UmaRequestingPartyClaimsCollectionEndpointControllerTests.class,
    UmaAuthorizationRequestEndpointControllerTests.class
})
@RunWith(JUnitPlatform.class)
public class UmaTestsSuite {
}

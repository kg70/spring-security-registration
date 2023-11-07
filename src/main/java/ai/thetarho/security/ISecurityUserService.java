package ai.thetarho.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(String token);

}

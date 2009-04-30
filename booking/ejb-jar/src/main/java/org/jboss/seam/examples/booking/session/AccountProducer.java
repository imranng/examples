package org.jboss.seam.examples.booking.session;

import javax.ejb.Local;
import org.jboss.seam.examples.booking.model.User;

/**
 * The <strong>AccountProducer</strong> produces the object that
 * represents the current user's account information. The account
 * information is represented by the {@link User} entity.
 *
 * @author Dan Allen
 */
public
@Local
interface AccountProducer {
   User getCurrentAccount();
}

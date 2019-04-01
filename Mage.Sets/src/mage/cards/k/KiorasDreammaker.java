package mage.cards.k;

import mage.MageInt;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.common.counter.ProliferateEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class KiorasDreammaker extends CardImpl {

    public KiorasDreammaker(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{5}{U}");

        this.subtype.add(SubType.LEVIATHAN);
        this.power = new MageInt(5);
        this.toughness = new MageInt(6);

        // When Kiora's Dreammaker enters the battlefield, proliferate.
        this.addAbility(new EntersBattlefieldTriggeredAbility(new ProliferateEffect()));
    }

    private KiorasDreammaker(final KiorasDreammaker card) {
        super(card);
    }

    @Override
    public KiorasDreammaker copy() {
        return new KiorasDreammaker(this);
    }
}

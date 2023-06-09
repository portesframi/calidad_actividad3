package mage.sets;

import mage.cards.Card;
import mage.cards.ExpansionSet;
import mage.cards.repository.CardInfo;
import mage.constants.Rarity;
import mage.constants.SetType;
import mage.util.RandomUtil;

import java.util.List;

/**
 * @author LevelX2
 */
public final class VintageMasters extends ExpansionSet {

    private static final VintageMasters instance = new VintageMasters();

    public static VintageMasters getInstance() {
        return instance;
    }

    private VintageMasters() {
        super("Vintage Masters", "VMA", ExpansionSet.buildDate(2014, 6, 16), SetType.MAGIC_ONLINE);
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterSpecial = 1;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        cards.add(new SetCardInfo("Academy Elite", 55, Rarity.RARE, mage.cards.a.AcademyElite.class));
        cards.add(new SetCardInfo("Addle", 103, Rarity.COMMON, mage.cards.a.Addle.class));
        cards.add(new SetCardInfo("Aether Mutation", 241, Rarity.UNCOMMON, mage.cards.a.AetherMutation.class));
        cards.add(new SetCardInfo("Afterlife", 10, Rarity.COMMON, mage.cards.a.Afterlife.class));
        cards.add(new SetCardInfo("Aftershock", 149, Rarity.COMMON, mage.cards.a.Aftershock.class));
        cards.add(new SetCardInfo("Akroma's Blessing", 11, Rarity.UNCOMMON, mage.cards.a.AkromasBlessing.class));
        cards.add(new SetCardInfo("Ancestral Recall", 1, Rarity.BONUS, mage.cards.a.AncestralRecall.class));
        cards.add(new SetCardInfo("Ancient Tomb", 289, Rarity.RARE, mage.cards.a.AncientTomb.class));
        cards.add(new SetCardInfo("Animate Dead", 104, Rarity.UNCOMMON, mage.cards.a.AnimateDead.class));
        cards.add(new SetCardInfo("Ankh of Mishra", 263, Rarity.RARE, mage.cards.a.AnkhOfMishra.class));
        cards.add(new SetCardInfo("Aquamoeba", 56, Rarity.COMMON, mage.cards.a.Aquamoeba.class));
        cards.add(new SetCardInfo("Armadillo Cloak", 242, Rarity.UNCOMMON, mage.cards.a.ArmadilloCloak.class));
        cards.add(new SetCardInfo("Armageddon", 12, Rarity.MYTHIC, mage.cards.a.Armageddon.class));
        cards.add(new SetCardInfo("Armor of Thorns", 194, Rarity.COMMON, mage.cards.a.ArmorOfThorns.class));
        cards.add(new SetCardInfo("Arrogant Wurm", 195, Rarity.COMMON, mage.cards.a.ArrogantWurm.class));
        cards.add(new SetCardInfo("Astral Slide", 13, Rarity.UNCOMMON, mage.cards.a.AstralSlide.class));
        cards.add(new SetCardInfo("Badlands", 291, Rarity.RARE, mage.cards.b.Badlands.class));
        cards.add(new SetCardInfo("Bad River", 290, Rarity.UNCOMMON, mage.cards.b.BadRiver.class));
        cards.add(new SetCardInfo("Balance", 14, Rarity.MYTHIC, mage.cards.b.Balance.class));
        cards.add(new SetCardInfo("Baleful Force", 105, Rarity.RARE, mage.cards.b.BalefulForce.class));
        cards.add(new SetCardInfo("Baleful Strix", 243, Rarity.RARE, mage.cards.b.BalefulStrix.class));
        cards.add(new SetCardInfo("Barren Moor", 292, Rarity.COMMON, mage.cards.b.BarrenMoor.class));
        cards.add(new SetCardInfo("Basandra, Battle Seraph", 244, Rarity.RARE, mage.cards.b.BasandraBattleSeraph.class));
        cards.add(new SetCardInfo("Basking Rootwalla", 196, Rarity.COMMON, mage.cards.b.BaskingRootwalla.class));
        cards.add(new SetCardInfo("Battle Screech", 15, Rarity.COMMON, mage.cards.b.BattleScreech.class));
        cards.add(new SetCardInfo("Bayou", 293, Rarity.RARE, mage.cards.b.Bayou.class));
        cards.add(new SetCardInfo("Bazaar of Baghdad", 294, Rarity.MYTHIC, mage.cards.b.BazaarOfBaghdad.class));
        cards.add(new SetCardInfo("Beetleback Chief", 150, Rarity.COMMON, mage.cards.b.BeetlebackChief.class));
        cards.add(new SetCardInfo("Benalish Trapper", 16, Rarity.COMMON, mage.cards.b.BenalishTrapper.class));
        cards.add(new SetCardInfo("Benevolent Bodyguard", 17, Rarity.COMMON, mage.cards.b.BenevolentBodyguard.class));
        cards.add(new SetCardInfo("Berserk", 197, Rarity.RARE, mage.cards.b.Berserk.class));
        cards.add(new SetCardInfo("Black Lotus", 4, Rarity.BONUS, mage.cards.b.BlackLotus.class));
        cards.add(new SetCardInfo("Blastoderm", 198, Rarity.UNCOMMON, mage.cards.b.Blastoderm.class));
        cards.add(new SetCardInfo("Blazing Specter", 245, Rarity.UNCOMMON, mage.cards.b.BlazingSpecter.class));
        cards.add(new SetCardInfo("Brago, King Eternal", 246, Rarity.RARE, mage.cards.b.BragoKingEternal.class));
        cards.add(new SetCardInfo("Brain Freeze", 57, Rarity.UNCOMMON, mage.cards.b.BrainFreeze.class));
        cards.add(new SetCardInfo("Brainstorm", 58, Rarity.COMMON, mage.cards.b.Brainstorm.class));
        cards.add(new SetCardInfo("Breath of Life", 18, Rarity.UNCOMMON, mage.cards.b.BreathOfLife.class));
        cards.add(new SetCardInfo("Brilliant Halo", 19, Rarity.COMMON, mage.cards.b.BrilliantHalo.class));
        cards.add(new SetCardInfo("Brindle Shoat", 199, Rarity.COMMON, mage.cards.b.BrindleShoat.class));
        cards.add(new SetCardInfo("Burning of Xinye", 151, Rarity.RARE, mage.cards.b.BurningOfXinye.class));
        cards.add(new SetCardInfo("Burning Wish", 152, Rarity.RARE, mage.cards.b.BurningWish.class));
        cards.add(new SetCardInfo("Cabal Ritual", 106, Rarity.UNCOMMON, mage.cards.c.CabalRitual.class));
        cards.add(new SetCardInfo("Caldera Lake", 295, Rarity.UNCOMMON, mage.cards.c.CalderaLake.class));
        cards.add(new SetCardInfo("Carnophage", 107, Rarity.COMMON, mage.cards.c.Carnophage.class));
        cards.add(new SetCardInfo("Chainer's Edict", 108, Rarity.COMMON, mage.cards.c.ChainersEdict.class));
        cards.add(new SetCardInfo("Chain Lightning", 153, Rarity.COMMON, mage.cards.c.ChainLightning.class));
        cards.add(new SetCardInfo("Channel", 200, Rarity.MYTHIC, mage.cards.c.Channel.class));
        cards.add(new SetCardInfo("Chaos Warp", 154, Rarity.RARE, mage.cards.c.ChaosWarp.class));
        cards.add(new SetCardInfo("Chartooth Cougar", 155, Rarity.COMMON, mage.cards.c.ChartoothCougar.class));
        cards.add(new SetCardInfo("Chimeric Idol", 264, Rarity.UNCOMMON, mage.cards.c.ChimericIdol.class));
        cards.add(new SetCardInfo("Choking Sands", 109, Rarity.COMMON, mage.cards.c.ChokingSands.class));
        cards.add(new SetCardInfo("Choking Tethers", 59, Rarity.COMMON, mage.cards.c.ChokingTethers.class));
        cards.add(new SetCardInfo("Circular Logic", 60, Rarity.COMMON, mage.cards.c.CircularLogic.class));
        cards.add(new SetCardInfo("City in a Bottle", 265, Rarity.MYTHIC, mage.cards.c.CityInABottle.class));
        cards.add(new SetCardInfo("Claws of Wirewood", 201, Rarity.COMMON, mage.cards.c.ClawsOfWirewood.class));
        cards.add(new SetCardInfo("Clickslither", 156, Rarity.RARE, mage.cards.c.Clickslither.class));
        cards.add(new SetCardInfo("Cloud Djinn", 61, Rarity.UNCOMMON, mage.cards.c.CloudDjinn.class));
        cards.add(new SetCardInfo("Cloud of Faeries", 62, Rarity.UNCOMMON, mage.cards.c.CloudOfFaeries.class));
        cards.add(new SetCardInfo("Coercive Portal", 266, Rarity.MYTHIC, mage.cards.c.CoercivePortal.class));
        cards.add(new SetCardInfo("Control Magic", 63, Rarity.RARE, mage.cards.c.ControlMagic.class));
        cards.add(new SetCardInfo("Council's Judgment", 20, Rarity.RARE, mage.cards.c.CouncilsJudgment.class));
        cards.add(new SetCardInfo("Counterspell", 64, Rarity.COMMON, mage.cards.c.Counterspell.class));
        cards.add(new SetCardInfo("Crater Hellion", 157, Rarity.RARE, mage.cards.c.CraterHellion.class));
        cards.add(new SetCardInfo("Crescendo of War", 21, Rarity.RARE, mage.cards.c.CrescendoOfWar.class));
        cards.add(new SetCardInfo("Crovax the Cursed", 110, Rarity.RARE, mage.cards.c.CrovaxTheCursed.class));
        cards.add(new SetCardInfo("Cruel Bargain", 111, Rarity.RARE, mage.cards.c.CruelBargain.class));
        cards.add(new SetCardInfo("Cursed Scroll", 267, Rarity.RARE, mage.cards.c.CursedScroll.class));
        cards.add(new SetCardInfo("Dack Fayden", 247, Rarity.MYTHIC, mage.cards.d.DackFayden.class));
        cards.add(new SetCardInfo("Dack's Duplicate", 248, Rarity.RARE, mage.cards.d.DacksDuplicate.class));
        cards.add(new SetCardInfo("Dark Hatchling", 112, Rarity.UNCOMMON, mage.cards.d.DarkHatchling.class));
        cards.add(new SetCardInfo("Dark Ritual", 113, Rarity.COMMON, mage.cards.d.DarkRitual.class));
        cards.add(new SetCardInfo("Dauthi Mercenary", 114, Rarity.COMMON, mage.cards.d.DauthiMercenary.class));
        cards.add(new SetCardInfo("Death Grasp", 249, Rarity.UNCOMMON, mage.cards.d.DeathGrasp.class));
        cards.add(new SetCardInfo("Deathreap Ritual", 250, Rarity.UNCOMMON, mage.cards.d.DeathreapRitual.class));
        cards.add(new SetCardInfo("Death's-Head Buzzard", 115, Rarity.COMMON, mage.cards.d.DeathsHeadBuzzard.class));
        cards.add(new SetCardInfo("Decree of Justice", 22, Rarity.RARE, mage.cards.d.DecreeOfJustice.class));
        cards.add(new SetCardInfo("Deep Analysis", 65, Rarity.COMMON, mage.cards.d.DeepAnalysis.class));
        cards.add(new SetCardInfo("Deftblade Elite", 23, Rarity.COMMON, mage.cards.d.DeftbladeElite.class));
        cards.add(new SetCardInfo("Demonic Tutor", 116, Rarity.MYTHIC, mage.cards.d.DemonicTutor.class));
        cards.add(new SetCardInfo("Deranged Hermit", 202, Rarity.RARE, mage.cards.d.DerangedHermit.class));
        cards.add(new SetCardInfo("Desert Twister", 203, Rarity.UNCOMMON, mage.cards.d.DesertTwister.class));
        cards.add(new SetCardInfo("Devout Witness", 24, Rarity.UNCOMMON, mage.cards.d.DevoutWitness.class));
        cards.add(new SetCardInfo("Drakestown Forgotten", 117, Rarity.RARE, mage.cards.d.DrakestownForgotten.class));
        cards.add(new SetCardInfo("Dreampod Druid", 204, Rarity.UNCOMMON, mage.cards.d.DreampodDruid.class));
        cards.add(new SetCardInfo("Edric, Spymaster of Trest", 251, Rarity.RARE, mage.cards.e.EdricSpymasterOfTrest.class));
        cards.add(new SetCardInfo("Elephant Guide", 205, Rarity.COMMON, mage.cards.e.ElephantGuide.class));
        cards.add(new SetCardInfo("Elvish Aberration", 206, Rarity.COMMON, mage.cards.e.ElvishAberration.class));
        cards.add(new SetCardInfo("Empyrial Armor", 25, Rarity.UNCOMMON, mage.cards.e.EmpyrialArmor.class));
        cards.add(new SetCardInfo("Ephemeron", 66, Rarity.RARE, mage.cards.e.Ephemeron.class));
        cards.add(new SetCardInfo("Erhnam Djinn", 207, Rarity.UNCOMMON, mage.cards.e.ErhnamDjinn.class));
        cards.add(new SetCardInfo("Eternal Dragon", 26, Rarity.RARE, mage.cards.e.EternalDragon.class));
        cards.add(new SetCardInfo("Eureka", 208, Rarity.MYTHIC, mage.cards.e.Eureka.class));
        cards.add(new SetCardInfo("Exile", 27, Rarity.COMMON, mage.cards.e.Exile.class));
        cards.add(new SetCardInfo("Expunge", 118, Rarity.COMMON, mage.cards.e.Expunge.class));
        cards.add(new SetCardInfo("Fact or Fiction", 67, Rarity.UNCOMMON, mage.cards.f.FactOrFiction.class));
        cards.add(new SetCardInfo("Fallen Askari", 119, Rarity.COMMON, mage.cards.f.FallenAskari.class));
        cards.add(new SetCardInfo("Falter", 158, Rarity.COMMON, mage.cards.f.Falter.class));
        cards.add(new SetCardInfo("Famine", 120, Rarity.UNCOMMON, mage.cards.f.Famine.class));
        cards.add(new SetCardInfo("Fastbond", 209, Rarity.MYTHIC, mage.cards.f.Fastbond.class));
        cards.add(new SetCardInfo("Fireblast", 159, Rarity.UNCOMMON, mage.cards.f.Fireblast.class));
        cards.add(new SetCardInfo("Fires of Yavimaya", 252, Rarity.UNCOMMON, mage.cards.f.FiresOfYavimaya.class));
        cards.add(new SetCardInfo("Flametongue Kavu", 160, Rarity.UNCOMMON, mage.cards.f.FlametongueKavu.class));
        cards.add(new SetCardInfo("Fledgling Djinn", 121, Rarity.COMMON, mage.cards.f.FledglingDjinn.class));
        cards.add(new SetCardInfo("Flood Plain", 296, Rarity.UNCOMMON, mage.cards.f.FloodPlain.class));
        cards.add(new SetCardInfo("Flowstone Hellion", 161, Rarity.UNCOMMON, mage.cards.f.FlowstoneHellion.class));
        cards.add(new SetCardInfo("Flowstone Sculpture", 268, Rarity.RARE, mage.cards.f.FlowstoneSculpture.class));
        cards.add(new SetCardInfo("Flusterstorm", 68, Rarity.RARE, mage.cards.f.Flusterstorm.class));
        cards.add(new SetCardInfo("Force of Will", 69, Rarity.RARE, mage.cards.f.ForceOfWill.class));
        cards.add(new SetCardInfo("Forgotten Cave", 297, Rarity.COMMON, mage.cards.f.ForgottenCave.class));
        cards.add(new SetCardInfo("Frantic Search", 70, Rarity.COMMON, mage.cards.f.FranticSearch.class));
        cards.add(new SetCardInfo("Future Sight", 71, Rarity.RARE, mage.cards.f.FutureSight.class));
        cards.add(new SetCardInfo("Fyndhorn Elves", 210, Rarity.COMMON, mage.cards.f.FyndhornElves.class));
        cards.add(new SetCardInfo("Gaea's Embrace", 211, Rarity.UNCOMMON, mage.cards.g.GaeasEmbrace.class));
        cards.add(new SetCardInfo("Gamble", 162, Rarity.RARE, mage.cards.g.Gamble.class));
        cards.add(new SetCardInfo("Genesis", 212, Rarity.RARE, mage.cards.g.Genesis.class));
        cards.add(new SetCardInfo("Gerrard's Battle Cry", 28, Rarity.RARE, mage.cards.g.GerrardsBattleCry.class));
        cards.add(new SetCardInfo("Giant Mantis", 213, Rarity.COMMON, mage.cards.g.GiantMantis.class));
        cards.add(new SetCardInfo("Giant Strength", 163, Rarity.COMMON, mage.cards.g.GiantStrength.class));
        cards.add(new SetCardInfo("Gigapede", 214, Rarity.RARE, mage.cards.g.Gigapede.class));
        cards.add(new SetCardInfo("Gilded Light", 29, Rarity.COMMON, mage.cards.g.GildedLight.class));
        cards.add(new SetCardInfo("Goblin Commando", 164, Rarity.COMMON, mage.cards.g.GoblinCommando.class));
        cards.add(new SetCardInfo("Goblin General", 165, Rarity.COMMON, mage.cards.g.GoblinGeneral.class));
        cards.add(new SetCardInfo("Goblin Goon", 166, Rarity.UNCOMMON, mage.cards.g.GoblinGoon.class));
        cards.add(new SetCardInfo("Goblin Lackey", 167, Rarity.RARE, mage.cards.g.GoblinLackey.class));
        cards.add(new SetCardInfo("Goblin Matron", 168, Rarity.COMMON, mage.cards.g.GoblinMatron.class));
        cards.add(new SetCardInfo("Goblin Patrol", 169, Rarity.COMMON, mage.cards.g.GoblinPatrol.class));
        cards.add(new SetCardInfo("Goblin Piledriver", 170, Rarity.RARE, mage.cards.g.GoblinPiledriver.class));
        cards.add(new SetCardInfo("Goblin Ringleader", 171, Rarity.UNCOMMON, mage.cards.g.GoblinRingleader.class));
        cards.add(new SetCardInfo("Goblin Settler", 172, Rarity.UNCOMMON, mage.cards.g.GoblinSettler.class));
        cards.add(new SetCardInfo("Goblin Trenches", 253, Rarity.UNCOMMON, mage.cards.g.GoblinTrenches.class));
        cards.add(new SetCardInfo("Goblin Warchief", 173, Rarity.UNCOMMON, mage.cards.g.GoblinWarchief.class));
        cards.add(new SetCardInfo("Grand Coliseum", 298, Rarity.RARE, mage.cards.g.GrandColiseum.class));
        cards.add(new SetCardInfo("Grasslands", 299, Rarity.UNCOMMON, mage.cards.g.Grasslands.class));
        cards.add(new SetCardInfo("Grenzo, Dungeon Warden", 254, Rarity.RARE, mage.cards.g.GrenzoDungeonWarden.class));
        cards.add(new SetCardInfo("Grizzly Fate", 215, Rarity.UNCOMMON, mage.cards.g.GrizzlyFate.class));
        cards.add(new SetCardInfo("Gush", 72, Rarity.UNCOMMON, mage.cards.g.Gush.class));
        cards.add(new SetCardInfo("Gustcloak Harrier", 30, Rarity.COMMON, mage.cards.g.GustcloakHarrier.class));
        cards.add(new SetCardInfo("Hermit Druid", 216, Rarity.RARE, mage.cards.h.HermitDruid.class));
        cards.add(new SetCardInfo("High Tide", 73, Rarity.UNCOMMON, mage.cards.h.HighTide.class));
        cards.add(new SetCardInfo("Hulking Goblin", 174, Rarity.COMMON, mage.cards.h.HulkingGoblin.class));
        cards.add(new SetCardInfo("Hymn to Tourach", 122, Rarity.UNCOMMON, mage.cards.h.HymnToTourach.class));
        cards.add(new SetCardInfo("Ichorid", 123, Rarity.RARE, mage.cards.i.Ichorid.class));
        cards.add(new SetCardInfo("Ivory Tower", 269, Rarity.UNCOMMON, mage.cards.i.IvoryTower.class));
        cards.add(new SetCardInfo("Jace, the Mind Sculptor", 74, Rarity.MYTHIC, mage.cards.j.JaceTheMindSculptor.class));
        cards.add(new SetCardInfo("Jareth, Leonine Titan", 31, Rarity.RARE, mage.cards.j.JarethLeonineTitan.class));
        cards.add(new SetCardInfo("Jungle Wurm", 217, Rarity.COMMON, mage.cards.j.JungleWurm.class));
        cards.add(new SetCardInfo("Kaervek's Torch", 175, Rarity.UNCOMMON, mage.cards.k.KaerveksTorch.class));
        cards.add(new SetCardInfo("Karmic Guide", 32, Rarity.RARE, mage.cards.k.KarmicGuide.class));
        cards.add(new SetCardInfo("Karn, Silver Golem", 270, Rarity.RARE, mage.cards.k.KarnSilverGolem.class));
        cards.add(new SetCardInfo("Keeneye Aven", 75, Rarity.COMMON, mage.cards.k.KeeneyeAven.class));
        cards.add(new SetCardInfo("Keldon Necropolis", 300, Rarity.RARE, mage.cards.k.KeldonNecropolis.class));
        cards.add(new SetCardInfo("Kezzerdrix", 124, Rarity.UNCOMMON, mage.cards.k.Kezzerdrix.class));
        cards.add(new SetCardInfo("Killer Whale", 76, Rarity.COMMON, mage.cards.k.KillerWhale.class));
        cards.add(new SetCardInfo("Kindle", 176, Rarity.COMMON, mage.cards.k.Kindle.class));
        cards.add(new SetCardInfo("Kjeldoran Outpost", 301, Rarity.RARE, mage.cards.k.KjeldoranOutpost.class));
        cards.add(new SetCardInfo("Kongming, \"Sleeping Dragon\"", 33, Rarity.RARE, mage.cards.k.KongmingSleepingDragon.class));
        cards.add(new SetCardInfo("Krosan Tusker", 218, Rarity.COMMON, mage.cards.k.KrosanTusker.class));
        cards.add(new SetCardInfo("Krosan Vorine", 219, Rarity.COMMON, mage.cards.k.KrosanVorine.class));
        cards.add(new SetCardInfo("Krovikan Sorcerer", 77, Rarity.COMMON, mage.cards.k.KrovikanSorcerer.class));
        cards.add(new SetCardInfo("Lake of the Dead", 302, Rarity.RARE, mage.cards.l.LakeOfTheDead.class));
        cards.add(new SetCardInfo("Laquatus's Champion", 125, Rarity.RARE, mage.cards.l.LaquatussChampion.class));
        cards.add(new SetCardInfo("Library of Alexandria", 303, Rarity.MYTHIC, mage.cards.l.LibraryOfAlexandria.class));
        cards.add(new SetCardInfo("Lightning Dragon", 177, Rarity.RARE, mage.cards.l.LightningDragon.class));
        cards.add(new SetCardInfo("Lightning Rift", 178, Rarity.UNCOMMON, mage.cards.l.LightningRift.class));
        cards.add(new SetCardInfo("Lion's Eye Diamond", 271, Rarity.MYTHIC, mage.cards.l.LionsEyeDiamond.class));
        cards.add(new SetCardInfo("Living Death", 126, Rarity.RARE, mage.cards.l.LivingDeath.class));
        cards.add(new SetCardInfo("Lonely Sandbar", 304, Rarity.COMMON, mage.cards.l.LonelySandbar.class));
        cards.add(new SetCardInfo("Lurking Evil", 127, Rarity.UNCOMMON, mage.cards.l.LurkingEvil.class));
        cards.add(new SetCardInfo("Magister of Worth", 255, Rarity.RARE, mage.cards.m.MagisterOfWorth.class));
        cards.add(new SetCardInfo("Mana Crypt", 272, Rarity.MYTHIC, mage.cards.m.ManaCrypt.class));
        cards.add(new SetCardInfo("Mana Drain", 78, Rarity.MYTHIC, mage.cards.m.ManaDrain.class));
        cards.add(new SetCardInfo("Mana Prism", 273, Rarity.COMMON, mage.cards.m.ManaPrism.class));
        cards.add(new SetCardInfo("Mana Vault", 274, Rarity.RARE, mage.cards.m.ManaVault.class));
        cards.add(new SetCardInfo("Man-o'-War", 79, Rarity.COMMON, mage.cards.m.ManOWar.class));
        cards.add(new SetCardInfo("Marchesa, the Black Rose", 256, Rarity.MYTHIC, mage.cards.m.MarchesaTheBlackRose.class));
        cards.add(new SetCardInfo("Masticore", 275, Rarity.RARE, mage.cards.m.Masticore.class));
        cards.add(new SetCardInfo("Memory Jar", 276, Rarity.MYTHIC, mage.cards.m.MemoryJar.class));
        cards.add(new SetCardInfo("Mesmeric Fiend", 128, Rarity.COMMON, mage.cards.m.MesmericFiend.class));
        cards.add(new SetCardInfo("Mind's Desire", 80, Rarity.RARE, mage.cards.m.MindsDesire.class));
        cards.add(new SetCardInfo("Mishra's Workshop", 305, Rarity.MYTHIC, mage.cards.m.MishrasWorkshop.class));
        cards.add(new SetCardInfo("Mistmoon Griffin", 34, Rarity.COMMON, mage.cards.m.MistmoonGriffin.class));
        cards.add(new SetCardInfo("Morphling", 81, Rarity.MYTHIC, mage.cards.m.Morphling.class));
        cards.add(new SetCardInfo("Mountain Valley", 306, Rarity.UNCOMMON, mage.cards.m.MountainValley.class));
        cards.add(new SetCardInfo("Mox Emerald", 5, Rarity.BONUS, mage.cards.m.MoxEmerald.class));
        cards.add(new SetCardInfo("Mox Jet", 6, Rarity.BONUS, mage.cards.m.MoxJet.class));
        cards.add(new SetCardInfo("Mox Pearl", 7, Rarity.BONUS, mage.cards.m.MoxPearl.class));
        cards.add(new SetCardInfo("Mox Ruby", 8, Rarity.BONUS, mage.cards.m.MoxRuby.class));
        cards.add(new SetCardInfo("Mox Sapphire", 9, Rarity.BONUS, mage.cards.m.MoxSapphire.class));
        cards.add(new SetCardInfo("Muzzio, Visionary Architect", 82, Rarity.MYTHIC, mage.cards.m.MuzzioVisionaryArchitect.class));
        cards.add(new SetCardInfo("Mystic Zealot", 35, Rarity.UNCOMMON, mage.cards.m.MysticZealot.class));
        cards.add(new SetCardInfo("Nature's Lore", 220, Rarity.COMMON, mage.cards.n.NaturesLore.class));
        cards.add(new SetCardInfo("Nature's Ruin", 129, Rarity.RARE, mage.cards.n.NaturesRuin.class));
        cards.add(new SetCardInfo("Necropotence", 130, Rarity.RARE, mage.cards.n.Necropotence.class));
        cards.add(new SetCardInfo("Nevinyrral's Disk", 277, Rarity.RARE, mage.cards.n.NevinyrralsDisk.class));
        cards.add(new SetCardInfo("Nightscape Familiar", 131, Rarity.COMMON, mage.cards.n.NightscapeFamiliar.class));
        cards.add(new SetCardInfo("Noble Templar", 36, Rarity.COMMON, mage.cards.n.NobleTemplar.class));
        cards.add(new SetCardInfo("Norwood Priestess", 221, Rarity.RARE, mage.cards.n.NorwoodPriestess.class));
        cards.add(new SetCardInfo("Nostalgic Dreams", 222, Rarity.UNCOMMON, mage.cards.n.NostalgicDreams.class));
        cards.add(new SetCardInfo("Null Rod", 278, Rarity.RARE, mage.cards.n.NullRod.class));
        cards.add(new SetCardInfo("Oath of Druids", 223, Rarity.MYTHIC, mage.cards.o.OathOfDruids.class));
        cards.add(new SetCardInfo("Obsessive Search", 83, Rarity.COMMON, mage.cards.o.ObsessiveSearch.class));
        cards.add(new SetCardInfo("Ophidian", 84, Rarity.COMMON, mage.cards.o.Ophidian.class));
        cards.add(new SetCardInfo("Orcish Lumberjack", 179, Rarity.COMMON, mage.cards.o.OrcishLumberjack.class));
        cards.add(new SetCardInfo("Owl Familiar", 85, Rarity.COMMON, mage.cards.o.OwlFamiliar.class));
        cards.add(new SetCardInfo("Palinchron", 86, Rarity.RARE, mage.cards.p.Palinchron.class));
        cards.add(new SetCardInfo("Parallax Wave", 37, Rarity.RARE, mage.cards.p.ParallaxWave.class));
        cards.add(new SetCardInfo("Paralyze", 132, Rarity.COMMON, mage.cards.p.Paralyze.class));
        cards.add(new SetCardInfo("Penumbra Wurm", 224, Rarity.UNCOMMON, mage.cards.p.PenumbraWurm.class));
        cards.add(new SetCardInfo("Phantom Nomad", 38, Rarity.COMMON, mage.cards.p.PhantomNomad.class));
        cards.add(new SetCardInfo("Phyrexian Defiler", 133, Rarity.UNCOMMON, mage.cards.p.PhyrexianDefiler.class));
        cards.add(new SetCardInfo("Pianna, Nomad Captain", 39, Rarity.UNCOMMON, mage.cards.p.PiannaNomadCaptain.class));
        cards.add(new SetCardInfo("Pillaging Horde", 180, Rarity.UNCOMMON, mage.cards.p.PillagingHorde.class));
        cards.add(new SetCardInfo("Pine Barrens", 307, Rarity.UNCOMMON, mage.cards.p.PineBarrens.class));
        cards.add(new SetCardInfo("Plateau", 308, Rarity.RARE, mage.cards.p.Plateau.class));
        cards.add(new SetCardInfo("Plea for Power", 87, Rarity.RARE, mage.cards.p.PleaForPower.class));
        cards.add(new SetCardInfo("Power Sink", 88, Rarity.UNCOMMON, mage.cards.p.PowerSink.class));
        cards.add(new SetCardInfo("Predator, Flagship", 279, Rarity.RARE, mage.cards.p.PredatorFlagship.class));
        cards.add(new SetCardInfo("Predatory Nightstalker", 134, Rarity.COMMON, mage.cards.p.PredatoryNightstalker.class));
        cards.add(new SetCardInfo("Prophetic Bolt", 257, Rarity.UNCOMMON, mage.cards.p.PropheticBolt.class));
        cards.add(new SetCardInfo("Provoke", 225, Rarity.COMMON, mage.cards.p.Provoke.class));
        cards.add(new SetCardInfo("Psychatog", 258, Rarity.UNCOMMON, mage.cards.p.Psychatog.class));
        cards.add(new SetCardInfo("Putrid Imp", 135, Rarity.COMMON, mage.cards.p.PutridImp.class));
        cards.add(new SetCardInfo("Radiant, Archangel", 40, Rarity.UNCOMMON, mage.cards.r.RadiantArchangel.class));
        cards.add(new SetCardInfo("Radiant's Judgment", 41, Rarity.COMMON, mage.cards.r.RadiantsJudgment.class));
        cards.add(new SetCardInfo("Realm Seekers", 226, Rarity.RARE, mage.cards.r.RealmSeekers.class));
        cards.add(new SetCardInfo("Reanimate", 136, Rarity.UNCOMMON, mage.cards.r.Reanimate.class));
        cards.add(new SetCardInfo("Reckless Charge", 181, Rarity.COMMON, mage.cards.r.RecklessCharge.class));
        cards.add(new SetCardInfo("Recurring Nightmare", 137, Rarity.RARE, mage.cards.r.RecurringNightmare.class));
        cards.add(new SetCardInfo("Regrowth", 227, Rarity.RARE, mage.cards.r.Regrowth.class));
        cards.add(new SetCardInfo("Reign of the Pit", 138, Rarity.RARE, mage.cards.r.ReignOfThePit.class));
        cards.add(new SetCardInfo("Renewed Faith", 42, Rarity.COMMON, mage.cards.r.RenewedFaith.class));
        cards.add(new SetCardInfo("Repel", 89, Rarity.COMMON, mage.cards.r.Repel.class));
        cards.add(new SetCardInfo("Rescind", 90, Rarity.COMMON, mage.cards.r.Rescind.class));
        cards.add(new SetCardInfo("Reviving Vapors", 259, Rarity.UNCOMMON, mage.cards.r.RevivingVapors.class));
        cards.add(new SetCardInfo("Ring of Gix", 280, Rarity.RARE, mage.cards.r.RingOfGix.class));
        cards.add(new SetCardInfo("Rites of Initiation", 182, Rarity.UNCOMMON, mage.cards.r.RitesOfInitiation.class));
        cards.add(new SetCardInfo("Roar of the Wurm", 228, Rarity.UNCOMMON, mage.cards.r.RoarOfTheWurm.class));
        cards.add(new SetCardInfo("Rocky Tar Pit", 309, Rarity.UNCOMMON, mage.cards.r.RockyTarPit.class));
        cards.add(new SetCardInfo("Rofellos, Llanowar Emissary", 229, Rarity.RARE, mage.cards.r.RofellosLlanowarEmissary.class));
        cards.add(new SetCardInfo("Rorix Bladewing", 183, Rarity.RARE, mage.cards.r.RorixBladewing.class));
        cards.add(new SetCardInfo("Salt Flats", 310, Rarity.UNCOMMON, mage.cards.s.SaltFlats.class));
        cards.add(new SetCardInfo("Saproling Burst", 230, Rarity.RARE, mage.cards.s.SaprolingBurst.class));
        cards.add(new SetCardInfo("Sarcomancy", 139, Rarity.UNCOMMON, mage.cards.s.Sarcomancy.class));
        cards.add(new SetCardInfo("Savannah", 311, Rarity.RARE, mage.cards.s.Savannah.class));
        cards.add(new SetCardInfo("Scabland", 312, Rarity.UNCOMMON, mage.cards.s.Scabland.class));
        cards.add(new SetCardInfo("Scourge of the Throne", 184, Rarity.MYTHIC, mage.cards.s.ScourgeOfTheThrone.class));
        cards.add(new SetCardInfo("Scrivener", 91, Rarity.COMMON, mage.cards.s.Scrivener.class));
        cards.add(new SetCardInfo("Scrubland", 313, Rarity.RARE, mage.cards.s.Scrubland.class));
        cards.add(new SetCardInfo("Sea Drake", 92, Rarity.RARE, mage.cards.s.SeaDrake.class));
        cards.add(new SetCardInfo("Seal of Cleansing", 43, Rarity.COMMON, mage.cards.s.SealOfCleansing.class));
        cards.add(new SetCardInfo("Secluded Steppe", 314, Rarity.COMMON, mage.cards.s.SecludedSteppe.class));
        cards.add(new SetCardInfo("Selvala, Explorer Returned", 260, Rarity.RARE, mage.cards.s.SelvalaExplorerReturned.class));
        cards.add(new SetCardInfo("Serendib Efreet", 93, Rarity.UNCOMMON, mage.cards.s.SerendibEfreet.class));
        cards.add(new SetCardInfo("Shelter", 44, Rarity.COMMON, mage.cards.s.Shelter.class));
        cards.add(new SetCardInfo("Shivan Wurm", 261, Rarity.RARE, mage.cards.s.ShivanWurm.class));
        cards.add(new SetCardInfo("Sidar Jabari", 45, Rarity.UNCOMMON, mage.cards.s.SidarJabari.class));
        cards.add(new SetCardInfo("Silvos, Rogue Elemental", 231, Rarity.RARE, mage.cards.s.SilvosRogueElemental.class));
        cards.add(new SetCardInfo("Simian Grunts", 232, Rarity.COMMON, mage.cards.s.SimianGrunts.class));
        cards.add(new SetCardInfo("Skirge Familiar", 140, Rarity.COMMON, mage.cards.s.SkirgeFamiliar.class));
        cards.add(new SetCardInfo("Skirk Drill Sergeant", 185, Rarity.COMMON, mage.cards.s.SkirkDrillSergeant.class));
        cards.add(new SetCardInfo("Skirk Prospector", 186, Rarity.COMMON, mage.cards.s.SkirkProspector.class));
        cards.add(new SetCardInfo("Skullclamp", 281, Rarity.MYTHIC, mage.cards.s.Skullclamp.class));
        cards.add(new SetCardInfo("Skyshroud Forest", 315, Rarity.UNCOMMON, mage.cards.s.SkyshroudForest.class));
        cards.add(new SetCardInfo("Skywing Aven", 94, Rarity.COMMON, mage.cards.s.SkywingAven.class));
        cards.add(new SetCardInfo("Smokestack", 282, Rarity.RARE, mage.cards.s.Smokestack.class));
        cards.add(new SetCardInfo("Solar Blast", 187, Rarity.COMMON, mage.cards.s.SolarBlast.class));
        cards.add(new SetCardInfo("Sol Ring", 283, Rarity.MYTHIC, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Soltari Emissary", 46, Rarity.COMMON, mage.cards.s.SoltariEmissary.class));
        cards.add(new SetCardInfo("Soltari Trooper", 47, Rarity.COMMON, mage.cards.s.SoltariTrooper.class));
        cards.add(new SetCardInfo("Spark Spray", 188, Rarity.COMMON, mage.cards.s.SparkSpray.class));
        cards.add(new SetCardInfo("Sphere of Resistance", 284, Rarity.RARE, mage.cards.s.SphereOfResistance.class));
        cards.add(new SetCardInfo("Spinal Graft", 141, Rarity.COMMON, mage.cards.s.SpinalGraft.class));
        cards.add(new SetCardInfo("Spirit Cairn", 48, Rarity.RARE, mage.cards.s.SpiritCairn.class));
        cards.add(new SetCardInfo("Spirit Mirror", 49, Rarity.RARE, mage.cards.s.SpiritMirror.class));
        cards.add(new SetCardInfo("Spiritmonger", 262, Rarity.RARE, mage.cards.s.Spiritmonger.class));
        cards.add(new SetCardInfo("Starstorm", 189, Rarity.RARE, mage.cards.s.Starstorm.class));
        cards.add(new SetCardInfo("Stoic Champion", 50, Rarity.UNCOMMON, mage.cards.s.StoicChampion.class));
        cards.add(new SetCardInfo("Strip Mine", 316, Rarity.RARE, mage.cards.s.StripMine.class));
        cards.add(new SetCardInfo("Stroke of Genius", 95, Rarity.RARE, mage.cards.s.StrokeOfGenius.class));
        cards.add(new SetCardInfo("Su-Chi", 285, Rarity.UNCOMMON, mage.cards.s.SuChi.class));
        cards.add(new SetCardInfo("Sudden Strength", 233, Rarity.COMMON, mage.cards.s.SuddenStrength.class));
        cards.add(new SetCardInfo("Sulfuric Vortex", 190, Rarity.RARE, mage.cards.s.SulfuricVortex.class));
        cards.add(new SetCardInfo("Survival of the Fittest", 234, Rarity.RARE, mage.cards.s.SurvivalOfTheFittest.class));
        cards.add(new SetCardInfo("Swords to Plowshares", 51, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("Sylvan Library", 235, Rarity.RARE, mage.cards.s.SylvanLibrary.class));
        cards.add(new SetCardInfo("Symbiotic Wurm", 236, Rarity.UNCOMMON, mage.cards.s.SymbioticWurm.class));
        cards.add(new SetCardInfo("Taiga", 317, Rarity.RARE, mage.cards.t.Taiga.class));
        cards.add(new SetCardInfo("Tangle", 237, Rarity.COMMON, mage.cards.t.Tangle.class));
        cards.add(new SetCardInfo("Temporal Fissure", 96, Rarity.COMMON, mage.cards.t.TemporalFissure.class));
        cards.add(new SetCardInfo("Tendrils of Agony", 142, Rarity.UNCOMMON, mage.cards.t.TendrilsOfAgony.class));
        cards.add(new SetCardInfo("Teroh's Faithful", 52, Rarity.COMMON, mage.cards.t.TerohsFaithful.class));
        cards.add(new SetCardInfo("Thalakos Drifters", 97, Rarity.UNCOMMON, mage.cards.t.ThalakosDrifters.class));
        cards.add(new SetCardInfo("Thawing Glaciers", 318, Rarity.RARE, mage.cards.t.ThawingGlaciers.class));
        cards.add(new SetCardInfo("Thopter Squadron", 286, Rarity.UNCOMMON, mage.cards.t.ThopterSquadron.class));
        cards.add(new SetCardInfo("Timetwister", 3, Rarity.BONUS, mage.cards.t.Timetwister.class));
        cards.add(new SetCardInfo("Time Vault", 287, Rarity.MYTHIC, mage.cards.t.TimeVault.class));
        cards.add(new SetCardInfo("Time Walk", 2, Rarity.BONUS, mage.cards.t.TimeWalk.class));
        cards.add(new SetCardInfo("Tolarian Academy", 319, Rarity.MYTHIC, mage.cards.t.TolarianAcademy.class));
        cards.add(new SetCardInfo("Tradewind Rider", 98, Rarity.RARE, mage.cards.t.TradewindRider.class));
        cards.add(new SetCardInfo("Tranquil Thicket", 320, Rarity.COMMON, mage.cards.t.TranquilThicket.class));
        cards.add(new SetCardInfo("Triangle of War", 288, Rarity.UNCOMMON, mage.cards.t.TriangleOfWar.class));
        cards.add(new SetCardInfo("Tribute to the Wild", 238, Rarity.COMMON, mage.cards.t.TributeToTheWild.class));
        cards.add(new SetCardInfo("Tropical Island", 321, Rarity.RARE, mage.cards.t.TropicalIsland.class));
        cards.add(new SetCardInfo("Tundra", 322, Rarity.RARE, mage.cards.t.Tundra.class));
        cards.add(new SetCardInfo("Turnabout", 99, Rarity.UNCOMMON, mage.cards.t.Turnabout.class));
        cards.add(new SetCardInfo("Tyrant's Choice", 143, Rarity.COMMON, mage.cards.t.TyrantsChoice.class));
        cards.add(new SetCardInfo("Underground Sea", 323, Rarity.RARE, mage.cards.u.UndergroundSea.class));
        cards.add(new SetCardInfo("Upheaval", 100, Rarity.MYTHIC, mage.cards.u.Upheaval.class));
        cards.add(new SetCardInfo("Urborg Uprising", 144, Rarity.COMMON, mage.cards.u.UrborgUprising.class));
        cards.add(new SetCardInfo("Vampiric Tutor", 145, Rarity.RARE, mage.cards.v.VampiricTutor.class));
        cards.add(new SetCardInfo("Visara the Dreadful", 146, Rarity.RARE, mage.cards.v.VisaraTheDreadful.class));
        cards.add(new SetCardInfo("Volcanic Island", 324, Rarity.RARE, mage.cards.v.VolcanicIsland.class));
        cards.add(new SetCardInfo("Volrath's Shapeshifter", 101, Rarity.RARE, mage.cards.v.VolrathsShapeshifter.class));
        cards.add(new SetCardInfo("Wall of Diffusion", 191, Rarity.COMMON, mage.cards.w.WallOfDiffusion.class));
        cards.add(new SetCardInfo("Waterfront Bouncer", 102, Rarity.UNCOMMON, mage.cards.w.WaterfrontBouncer.class));
        cards.add(new SetCardInfo("Wheel of Fortune", 192, Rarity.MYTHIC, mage.cards.w.WheelOfFortune.class));
        cards.add(new SetCardInfo("Wild Mongrel", 239, Rarity.COMMON, mage.cards.w.WildMongrel.class));
        cards.add(new SetCardInfo("Winds of Rath", 53, Rarity.RARE, mage.cards.w.WindsOfRath.class));
        cards.add(new SetCardInfo("Worldgorger Dragon", 193, Rarity.RARE, mage.cards.w.WorldgorgerDragon.class));
        cards.add(new SetCardInfo("Yavimaya Elder", 240, Rarity.UNCOMMON, mage.cards.y.YavimayaElder.class));
        cards.add(new SetCardInfo("Yavimaya Hollow", 325, Rarity.RARE, mage.cards.y.YavimayaHollow.class));
        cards.add(new SetCardInfo("Yawgmoth's Bargain", 147, Rarity.MYTHIC, mage.cards.y.YawgmothsBargain.class));
        cards.add(new SetCardInfo("Yawgmoth's Will", 148, Rarity.MYTHIC, mage.cards.y.YawgmothsWill.class));
        cards.add(new SetCardInfo("Zhalfirin Crusader", 54, Rarity.RARE, mage.cards.z.ZhalfirinCrusader.class));
    }

    @Override
    protected void addSpecialCards(List<Card> booster, int number) {
        // number is here always 1
        Rarity rarity;
        // You will open a Power Nine card about once in 53 packs
        if (RandomUtil.nextInt(53) == 0) {
            rarity = Rarity.BONUS;
        } else {
            // assuming same distribution as foils in paper Masters sets, 10:3:1 C:U:R
            int rarityKey = RandomUtil.nextInt(112);
            if (rarityKey < 80) {
                rarity = Rarity.COMMON;
            } else if (rarityKey < 104) {
                rarity = Rarity.UNCOMMON;
            } else if (rarityKey < 111) {
                rarity = Rarity.RARE;
            } else {
                rarity = Rarity.MYTHIC;
            }
        }
        addToBooster(booster, getCardsByRarity(rarity));
    }
}

package mage.sets;

import mage.cards.ExpansionSet;
import mage.cards.repository.CardInfo;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.List;

/**
 * @author LevelX2
 */
public final class MastersEditionIV extends ExpansionSet {

    private static final MastersEditionIV instance = new MastersEditionIV();

    public static MastersEditionIV getInstance() {
        return instance;
    }

    private MastersEditionIV() {
        super("Masters Edition IV", "ME4", ExpansionSet.buildDate(2011, 1, 10), SetType.MAGIC_ONLINE);
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        this.ratioBoosterSpecialLand = 1; // replace all basic lands

        cards.add(new SetCardInfo("Acid Rain", 36, Rarity.RARE, mage.cards.a.AcidRain.class));
        cards.add(new SetCardInfo("Aesthir Glider", 176, Rarity.COMMON, mage.cards.a.AesthirGlider.class));
        cards.add(new SetCardInfo("Air Elemental", 37, Rarity.UNCOMMON, mage.cards.a.AirElemental.class));
        cards.add(new SetCardInfo("Al-abara's Carpet", 177, Rarity.RARE, mage.cards.a.AlAbarasCarpet.class));
        cards.add(new SetCardInfo("Alaborn Musketeer", 1, Rarity.COMMON, mage.cards.a.AlabornMusketeer.class));
        cards.add(new SetCardInfo("Alaborn Trooper", 2, Rarity.COMMON, mage.cards.a.AlabornTrooper.class));
        cards.add(new SetCardInfo("Aladdin", 106, Rarity.RARE, mage.cards.a.Aladdin.class));
        cards.add(new SetCardInfo("Alchor's Tomb", 178, Rarity.RARE, mage.cards.a.AlchorsTomb.class));
        cards.add(new SetCardInfo("Ali from Cairo", 107, Rarity.RARE, mage.cards.a.AliFromCairo.class));
        cards.add(new SetCardInfo("Alluring Scent", 141, Rarity.COMMON, mage.cards.a.AlluringScent.class));
        cards.add(new SetCardInfo("Amulet of Kroog", 179, Rarity.COMMON, mage.cards.a.AmuletOfKroog.class));
        cards.add(new SetCardInfo("Angelic Voices", 3, Rarity.UNCOMMON, mage.cards.a.AngelicVoices.class));
        cards.add(new SetCardInfo("Animate Artifact", 38, Rarity.UNCOMMON, mage.cards.a.AnimateArtifact.class));
        cards.add(new SetCardInfo("Argivian Blacksmith", 4, Rarity.UNCOMMON, mage.cards.a.ArgivianBlacksmith.class));
        cards.add(new SetCardInfo("Argothian Pixies", 142, Rarity.COMMON, mage.cards.a.ArgothianPixies.class));
        cards.add(new SetCardInfo("Argothian Treefolk", 143, Rarity.UNCOMMON, mage.cards.a.ArgothianTreefolk.class));
        cards.add(new SetCardInfo("Armageddon Clock", 180, Rarity.RARE, mage.cards.a.ArmageddonClock.class));
        cards.add(new SetCardInfo("Armageddon", 5, Rarity.RARE, mage.cards.a.Armageddon.class));
        cards.add(new SetCardInfo("Artifact Blast", 108, Rarity.COMMON, mage.cards.a.ArtifactBlast.class));
        cards.add(new SetCardInfo("Ashnod's Altar", 181, Rarity.RARE, mage.cards.a.AshnodsAltar.class));
        cards.add(new SetCardInfo("Atog", 109, Rarity.COMMON, mage.cards.a.Atog.class));
        cards.add(new SetCardInfo("Badlands", 241, Rarity.RARE, mage.cards.b.Badlands.class));
        cards.add(new SetCardInfo("Balance", 6, Rarity.RARE, mage.cards.b.Balance.class));
        cards.add(new SetCardInfo("Basalt Monolith", 182, Rarity.UNCOMMON, mage.cards.b.BasaltMonolith.class));
        cards.add(new SetCardInfo("Bayou", 242, Rarity.RARE, mage.cards.b.Bayou.class));
        cards.add(new SetCardInfo("Bee Sting", 144, Rarity.UNCOMMON, mage.cards.b.BeeSting.class));
        cards.add(new SetCardInfo("Bird Maiden", 110, Rarity.COMMON, mage.cards.b.BirdMaiden.class));
        cards.add(new SetCardInfo("Black Knight", 71, Rarity.UNCOMMON, mage.cards.b.BlackKnight.class));
        cards.add(new SetCardInfo("Blaze of Glory", 7, Rarity.UNCOMMON, mage.cards.b.BlazeOfGlory.class));
        cards.add(new SetCardInfo("Blue Elemental Blast", 39, Rarity.UNCOMMON, mage.cards.b.BlueElementalBlast.class));
        cards.add(new SetCardInfo("Book of Rass", 183, Rarity.UNCOMMON, mage.cards.b.BookOfRass.class));
        cards.add(new SetCardInfo("Bottle of Suleiman", 184, Rarity.RARE, mage.cards.b.BottleOfSuleiman.class));
        cards.add(new SetCardInfo("Braingeyser", 40, Rarity.RARE, mage.cards.b.Braingeyser.class));
        cards.add(new SetCardInfo("Brass Man", 185, Rarity.COMMON, mage.cards.b.BrassMan.class));
        cards.add(new SetCardInfo("Candelabra of Tawnos", 187, Rarity.RARE, mage.cards.c.CandelabraOfTawnos.class));
        cards.add(new SetCardInfo("Celestial Sword", 188, Rarity.UNCOMMON, mage.cards.c.CelestialSword.class));
        cards.add(new SetCardInfo("Champion Lancer", 8, Rarity.RARE, mage.cards.c.ChampionLancer.class));
        cards.add(new SetCardInfo("Channel", 145, Rarity.RARE, mage.cards.c.Channel.class));
        cards.add(new SetCardInfo("Citanul Druid", 146, Rarity.COMMON, mage.cards.c.CitanulDruid.class));
        cards.add(new SetCardInfo("City of Brass", 243, Rarity.RARE, mage.cards.c.CityOfBrass.class));
        cards.add(new SetCardInfo("Clay Statue", 189, Rarity.UNCOMMON, mage.cards.c.ClayStatue.class));
        cards.add(new SetCardInfo("Clockwork Avian", 190, Rarity.UNCOMMON, mage.cards.c.ClockworkAvian.class));
        cards.add(new SetCardInfo("Clockwork Gnomes", 191, Rarity.UNCOMMON, mage.cards.c.ClockworkGnomes.class));
        cards.add(new SetCardInfo("Clockwork Swarm", 192, Rarity.COMMON, mage.cards.c.ClockworkSwarm.class));
        cards.add(new SetCardInfo("Cloud Dragon", 41, Rarity.RARE, mage.cards.c.CloudDragon.class));
        cards.add(new SetCardInfo("Cloud Spirit", 42, Rarity.COMMON, mage.cards.c.CloudSpirit.class));
        cards.add(new SetCardInfo("Colossus of Sardia", 193, Rarity.RARE, mage.cards.c.ColossusOfSardia.class));
        cards.add(new SetCardInfo("Control Magic", 43, Rarity.RARE, mage.cards.c.ControlMagic.class));
        cards.add(new SetCardInfo("Conversion", 9, Rarity.RARE, mage.cards.c.Conversion.class));
        cards.add(new SetCardInfo("Copy Artifact", 44, Rarity.RARE, mage.cards.c.CopyArtifact.class));
        cards.add(new SetCardInfo("Coral Helm", 194, Rarity.UNCOMMON, mage.cards.c.CoralHelm.class));
        cards.add(new SetCardInfo("Counterspell", 45, Rarity.COMMON, mage.cards.c.Counterspell.class));
        cards.add(new SetCardInfo("Crumble", 147, Rarity.COMMON, mage.cards.c.Crumble.class));
        cards.add(new SetCardInfo("Cyclone", 148, Rarity.RARE, mage.cards.c.Cyclone.class));
        cards.add(new SetCardInfo("Cyclopean Mummy", 72, Rarity.COMMON, mage.cards.c.CyclopeanMummy.class));
        cards.add(new SetCardInfo("Cyclopean Tomb", 195, Rarity.RARE, mage.cards.c.CyclopeanTomb.class));
        cards.add(new SetCardInfo("Dakmor Plague", 73, Rarity.UNCOMMON, mage.cards.d.DakmorPlague.class));
        cards.add(new SetCardInfo("Dark Ritual", 74, Rarity.COMMON, mage.cards.d.DarkRitual.class));
        cards.add(new SetCardInfo("Deathcoil Wurm", 149, Rarity.RARE, mage.cards.d.DeathcoilWurm.class));
        cards.add(new SetCardInfo("Deathgrip", 75, Rarity.RARE, mage.cards.d.Deathgrip.class));
        cards.add(new SetCardInfo("Demonic Hordes", 76, Rarity.RARE, mage.cards.d.DemonicHordes.class));
        cards.add(new SetCardInfo("Demonic Tutor", 77, Rarity.RARE, mage.cards.d.DemonicTutor.class));
        cards.add(new SetCardInfo("Detonate", 111, Rarity.UNCOMMON, mage.cards.d.Detonate.class));
        cards.add(new SetCardInfo("Devastation", 112, Rarity.RARE, mage.cards.d.Devastation.class));
        cards.add(new SetCardInfo("Diabolic Machine", 196, Rarity.UNCOMMON, mage.cards.d.DiabolicMachine.class));
        cards.add(new SetCardInfo("Divine Offering", 10, Rarity.COMMON, mage.cards.d.DivineOffering.class));
        cards.add(new SetCardInfo("Dragon Engine", 197, Rarity.COMMON, mage.cards.d.DragonEngine.class));
        cards.add(new SetCardInfo("Drain Power", 46, Rarity.RARE, mage.cards.d.DrainPower.class));
        cards.add(new SetCardInfo("Dread Reaper", 78, Rarity.RARE, mage.cards.d.DreadReaper.class));
        cards.add(new SetCardInfo("Dread Wight", 79, Rarity.UNCOMMON, mage.cards.d.DreadWight.class));
        cards.add(new SetCardInfo("Drop of Honey", 150, Rarity.RARE, mage.cards.d.DropOfHoney.class));
        cards.add(new SetCardInfo("Drowned", 47, Rarity.COMMON, mage.cards.d.Drowned.class));
        cards.add(new SetCardInfo("Dust to Dust", 11, Rarity.UNCOMMON, mage.cards.d.DustToDust.class));
        cards.add(new SetCardInfo("Ebon Dragon", 80, Rarity.RARE, mage.cards.e.EbonDragon.class));
        cards.add(new SetCardInfo("Ebony Horse", 198, Rarity.COMMON, mage.cards.e.EbonyHorse.class));
        cards.add(new SetCardInfo("Ebony Rhino", 199, Rarity.COMMON, mage.cards.e.EbonyRhino.class));
        cards.add(new SetCardInfo("Elephant Graveyard", 244, Rarity.UNCOMMON, mage.cards.e.ElephantGraveyard.class));
        cards.add(new SetCardInfo("Elite Cat Warrior", 151, Rarity.COMMON, mage.cards.e.EliteCatWarrior.class));
        cards.add(new SetCardInfo("Energy Flux", 48, Rarity.UNCOMMON, mage.cards.e.EnergyFlux.class));
        cards.add(new SetCardInfo("Eye for an Eye", 12, Rarity.RARE, mage.cards.e.EyeForAnEye.class));
        cards.add(new SetCardInfo("False Summoning", 49, Rarity.COMMON, mage.cards.f.FalseSummoning.class));
        cards.add(new SetCardInfo("Fastbond", 152, Rarity.RARE, mage.cards.f.Fastbond.class));
        cards.add(new SetCardInfo("Fire Imp", 113, Rarity.UNCOMMON, mage.cards.f.FireImp.class));
        cards.add(new SetCardInfo("Fire Tempest", 114, Rarity.RARE, mage.cards.f.FireTempest.class));
        cards.add(new SetCardInfo("Fireball", 115, Rarity.UNCOMMON, mage.cards.f.Fireball.class));
        cards.add(new SetCardInfo("Floodwater Dam", 200, Rarity.RARE, mage.cards.f.FloodwaterDam.class));
        cards.add(new SetCardInfo("Flying Carpet", 201, Rarity.COMMON, mage.cards.f.FlyingCarpet.class));
        cards.add(new SetCardInfo("Fog", 153, Rarity.COMMON, mage.cards.f.Fog.class));
        cards.add(new SetCardInfo("Force of Nature", 154, Rarity.RARE, mage.cards.f.ForceOfNature.class));
        cards.add(new SetCardInfo("Fork", 116, Rarity.RARE, mage.cards.f.Fork.class));
        cards.add(new SetCardInfo("Foul Spirit", 81, Rarity.COMMON, mage.cards.f.FoulSpirit.class));
        cards.add(new SetCardInfo("Gaea's Avenger", 155, Rarity.UNCOMMON, mage.cards.g.GaeasAvenger.class));
        cards.add(new SetCardInfo("Gate to Phyrexia", 82, Rarity.UNCOMMON, mage.cards.g.GateToPhyrexia.class));
        cards.add(new SetCardInfo("Gauntlet of Might", 202, Rarity.RARE, mage.cards.g.GauntletOfMight.class));
        cards.add(new SetCardInfo("Giant Growth", 156, Rarity.COMMON, mage.cards.g.GiantGrowth.class));
        cards.add(new SetCardInfo("Giant Tortoise", 50, Rarity.COMMON, mage.cards.g.GiantTortoise.class));
        cards.add(new SetCardInfo("Glasses of Urza", 203, Rarity.COMMON, mage.cards.g.GlassesOfUrza.class));
        cards.add(new SetCardInfo("Gloom", 83, Rarity.RARE, mage.cards.g.Gloom.class));
        cards.add(new SetCardInfo("Goblin Bully", 117, Rarity.COMMON, mage.cards.g.GoblinBully.class));
        cards.add(new SetCardInfo("Goblin Cavaliers", 118, Rarity.COMMON, mage.cards.g.GoblinCavaliers.class));
        cards.add(new SetCardInfo("Goblin Caves", 119, Rarity.COMMON, mage.cards.g.GoblinCaves.class));
        cards.add(new SetCardInfo("Goblin Firestarter", 120, Rarity.COMMON, mage.cards.g.GoblinFirestarter.class));
        cards.add(new SetCardInfo("Goblin General", 121, Rarity.UNCOMMON, mage.cards.g.GoblinGeneral.class));
        cards.add(new SetCardInfo("Goblin Shrine", 122, Rarity.COMMON, mage.cards.g.GoblinShrine.class));
        cards.add(new SetCardInfo("Goblin Warrens", 123, Rarity.UNCOMMON, mage.cards.g.GoblinWarrens.class));
        cards.add(new SetCardInfo("Gorilla War Cry", 124, Rarity.COMMON, mage.cards.g.GorillaWarCry.class));
        cards.add(new SetCardInfo("Grapeshot Catapult", 204, Rarity.UNCOMMON, mage.cards.g.GrapeshotCatapult.class));
        cards.add(new SetCardInfo("Gravebind", 84, Rarity.COMMON, mage.cards.g.Gravebind.class));
        cards.add(new SetCardInfo("Guardian Beast", 85, Rarity.RARE, mage.cards.g.GuardianBeast.class));
        cards.add(new SetCardInfo("Harsh Justice", 13, Rarity.RARE, mage.cards.h.HarshJustice.class));
        cards.add(new SetCardInfo("Hasran Ogress", 86, Rarity.COMMON, mage.cards.h.HasranOgress.class));
        cards.add(new SetCardInfo("Healing Salve", 14, Rarity.COMMON, mage.cards.h.HealingSalve.class));
        cards.add(new SetCardInfo("Horn of Deafening", 205, Rarity.UNCOMMON, mage.cards.h.HornOfDeafening.class));
        cards.add(new SetCardInfo("Howl from Beyond", 87, Rarity.COMMON, mage.cards.h.HowlFromBeyond.class));
        cards.add(new SetCardInfo("Ice Cauldron", 206, Rarity.RARE, mage.cards.i.IceCauldron.class));
        cards.add(new SetCardInfo("Icy Manipulator", 207, Rarity.UNCOMMON, mage.cards.i.IcyManipulator.class));
        cards.add(new SetCardInfo("In the Eye of Chaos", 51, Rarity.RARE, mage.cards.i.InTheEyeOfChaos.class));
        cards.add(new SetCardInfo("Instill Energy", 157, Rarity.UNCOMMON, mage.cards.i.InstillEnergy.class));
        cards.add(new SetCardInfo("Ironhoof Ox", 158, Rarity.COMMON, mage.cards.i.IronhoofOx.class));
        cards.add(new SetCardInfo("Island Sanctuary", 15, Rarity.RARE, mage.cards.i.IslandSanctuary.class));
        cards.add(new SetCardInfo("Jade Monolith", 208, Rarity.RARE, mage.cards.j.JadeMonolith.class));
        cards.add(new SetCardInfo("Juggernaut", 209, Rarity.UNCOMMON, mage.cards.j.Juggernaut.class));
        cards.add(new SetCardInfo("Junun Efreet", 88, Rarity.UNCOMMON, mage.cards.j.JununEfreet.class));
        cards.add(new SetCardInfo("Just Fate", 16, Rarity.COMMON, mage.cards.j.JustFate.class));
        cards.add(new SetCardInfo("Kismet", 17, Rarity.RARE, mage.cards.k.Kismet.class));
        cards.add(new SetCardInfo("Kormus Bell", 210, Rarity.RARE, mage.cards.k.KormusBell.class));
        cards.add(new SetCardInfo("Kudzu", 159, Rarity.UNCOMMON, mage.cards.k.Kudzu.class));
        cards.add(new SetCardInfo("Last Chance", 125, Rarity.RARE, mage.cards.l.LastChance.class));
        cards.add(new SetCardInfo("Lava Flow", 126, Rarity.COMMON, mage.cards.l.LavaFlow.class));
        cards.add(new SetCardInfo("Leeches", 18, Rarity.RARE, mage.cards.l.Leeches.class));
        cards.add(new SetCardInfo("Library of Alexandria", 245, Rarity.RARE, mage.cards.l.LibraryOfAlexandria.class));
        cards.add(new SetCardInfo("Library of Leng", 211, Rarity.COMMON, mage.cards.l.LibraryOfLeng.class));
        cards.add(new SetCardInfo("Lich", 89, Rarity.RARE, mage.cards.l.Lich.class));
        cards.add(new SetCardInfo("Lifeforce", 160, Rarity.RARE, mage.cards.l.Lifeforce.class));
        cards.add(new SetCardInfo("Lim-Dul's Cohort", 90, Rarity.COMMON, mage.cards.l.LimDulsCohort.class));
        cards.add(new SetCardInfo("Living Lands", 161, Rarity.RARE, mage.cards.l.LivingLands.class));
        cards.add(new SetCardInfo("Living Wall", 212, Rarity.UNCOMMON, mage.cards.l.LivingWall.class));
        cards.add(new SetCardInfo("Mahamoti Djinn", 52, Rarity.RARE, mage.cards.m.MahamotiDjinn.class));
        cards.add(new SetCardInfo("Mana Matrix", 213, Rarity.RARE, mage.cards.m.ManaMatrix.class));
        cards.add(new SetCardInfo("Mana Vault", 214, Rarity.RARE, mage.cards.m.ManaVault.class));
        cards.add(new SetCardInfo("Martyr's Cry", 19, Rarity.RARE, mage.cards.m.MartyrsCry.class));
        cards.add(new SetCardInfo("Martyrs of Korlis", 20, Rarity.UNCOMMON, mage.cards.m.MartyrsOfKorlis.class));
        cards.add(new SetCardInfo("Maze of Ith", 246, Rarity.RARE, mage.cards.m.MazeOfIth.class));
        cards.add(new SetCardInfo("Mightstone", 215, Rarity.COMMON, mage.cards.m.Mightstone.class));
        cards.add(new SetCardInfo("Mijae Djinn", 127, Rarity.RARE, mage.cards.m.MijaeDjinn.class));
        cards.add(new SetCardInfo("Minion of Tevesh Szat", 91, Rarity.RARE, mage.cards.m.MinionOfTeveshSzat.class));
        cards.add(new SetCardInfo("Mishra's Workshop", 247, Rarity.RARE, mage.cards.m.MishrasWorkshop.class));
        cards.add(new SetCardInfo("Mystic Decree", 53, Rarity.UNCOMMON, mage.cards.m.MysticDecree.class));
        cards.add(new SetCardInfo("Naked Singularity", 216, Rarity.RARE, mage.cards.n.NakedSingularity.class));
        cards.add(new SetCardInfo("Oasis", 248, Rarity.COMMON, mage.cards.o.Oasis.class));
        cards.add(new SetCardInfo("Obelisk of Undoing", 217, Rarity.RARE, mage.cards.o.ObeliskOfUndoing.class));
        cards.add(new SetCardInfo("Obsianus Golem", 218, Rarity.COMMON, mage.cards.o.ObsianusGolem.class));
        cards.add(new SetCardInfo("Ogre Taskmaster", 128, Rarity.COMMON, mage.cards.o.OgreTaskmaster.class));
        cards.add(new SetCardInfo("Onulet", 219, Rarity.COMMON, mage.cards.o.Onulet.class));
        cards.add(new SetCardInfo("Orcish Mechanics", 129, Rarity.UNCOMMON, mage.cards.o.OrcishMechanics.class));
        cards.add(new SetCardInfo("Osai Vultures", 21, Rarity.COMMON, mage.cards.o.OsaiVultures.class));
        cards.add(new SetCardInfo("Overwhelming Forces", 92, Rarity.RARE, mage.cards.o.OverwhelmingForces.class));
        cards.add(new SetCardInfo("Owl Familiar", 54, Rarity.COMMON, mage.cards.o.OwlFamiliar.class));
        cards.add(new SetCardInfo("Pentagram of the Ages", 220, Rarity.UNCOMMON, mage.cards.p.PentagramOfTheAges.class));
        cards.add(new SetCardInfo("Personal Incarnation", 22, Rarity.RARE, mage.cards.p.PersonalIncarnation.class));
        cards.add(new SetCardInfo("Phantasmal Forces", 55, Rarity.COMMON, mage.cards.p.PhantasmalForces.class));
        cards.add(new SetCardInfo("Phantasmal Terrain", 56, Rarity.COMMON, mage.cards.p.PhantasmalTerrain.class));
        cards.add(new SetCardInfo("Planar Gate", 221, Rarity.UNCOMMON, mage.cards.p.PlanarGate.class));
        cards.add(new SetCardInfo("Plateau", 249, Rarity.RARE, mage.cards.p.Plateau.class));
        cards.add(new SetCardInfo("Power Artifact", 57, Rarity.RARE, mage.cards.p.PowerArtifact.class));
        cards.add(new SetCardInfo("Primal Clay", 222, Rarity.COMMON, mage.cards.p.PrimalClay.class));
        cards.add(new SetCardInfo("Prodigal Sorcerer", 58, Rarity.UNCOMMON, mage.cards.p.ProdigalSorcerer.class));
        cards.add(new SetCardInfo("Prowling Nightstalker", 93, Rarity.COMMON, mage.cards.p.ProwlingNightstalker.class));
        cards.add(new SetCardInfo("Radjan Spirit", 162, Rarity.UNCOMMON, mage.cards.r.RadjanSpirit.class));
        cards.add(new SetCardInfo("Rain of Daggers", 94, Rarity.RARE, mage.cards.r.RainOfDaggers.class));
        cards.add(new SetCardInfo("Rakalite", 223, Rarity.RARE, mage.cards.r.Rakalite.class));
        cards.add(new SetCardInfo("Reconstruction", 59, Rarity.COMMON, mage.cards.r.Reconstruction.class));
        cards.add(new SetCardInfo("Red Elemental Blast", 131, Rarity.UNCOMMON, mage.cards.r.RedElementalBlast.class));
        cards.add(new SetCardInfo("Regrowth", 163, Rarity.RARE, mage.cards.r.Regrowth.class));
        cards.add(new SetCardInfo("Righteous Charge", 23, Rarity.COMMON, mage.cards.r.RighteousCharge.class));
        cards.add(new SetCardInfo("Ring of Renewal", 224, Rarity.RARE, mage.cards.r.RingOfRenewal.class));
        cards.add(new SetCardInfo("Roc of Kher Ridges", 132, Rarity.UNCOMMON, mage.cards.r.RocOfKherRidges.class));
        cards.add(new SetCardInfo("Rock Hydra", 133, Rarity.RARE, mage.cards.r.RockHydra.class));
        cards.add(new SetCardInfo("Rockslide Ambush", 134, Rarity.COMMON, mage.cards.r.RockslideAmbush.class));
        cards.add(new SetCardInfo("Sandstorm", 164, Rarity.COMMON, mage.cards.s.Sandstorm.class));
        cards.add(new SetCardInfo("Savannah Lions", 24, Rarity.UNCOMMON, mage.cards.s.SavannahLions.class));
        cards.add(new SetCardInfo("Savannah", 250, Rarity.RARE, mage.cards.s.Savannah.class));
        cards.add(new SetCardInfo("Scarecrow", 225, Rarity.UNCOMMON, mage.cards.s.Scarecrow.class));
        cards.add(new SetCardInfo("Scarwood Bandits", 165, Rarity.RARE, mage.cards.s.ScarwoodBandits.class));
        cards.add(new SetCardInfo("Scavenger Folk", 166, Rarity.COMMON, mage.cards.s.ScavengerFolk.class));
        cards.add(new SetCardInfo("Scavenging Ghoul", 95, Rarity.UNCOMMON, mage.cards.s.ScavengingGhoul.class));
        cards.add(new SetCardInfo("Scrubland", 251, Rarity.RARE, mage.cards.s.Scrubland.class));
        cards.add(new SetCardInfo("Sea Serpent", 60, Rarity.COMMON, mage.cards.s.SeaSerpent.class));
        cards.add(new SetCardInfo("Sedge Troll", 135, Rarity.RARE, mage.cards.s.SedgeTroll.class));
        cards.add(new SetCardInfo("Sengir Vampire", 96, Rarity.UNCOMMON, mage.cards.s.SengirVampire.class));
        cards.add(new SetCardInfo("Serendib Djinn", 61, Rarity.RARE, mage.cards.s.SerendibDjinn.class));
        cards.add(new SetCardInfo("Serra Angel", 25, Rarity.UNCOMMON, mage.cards.s.SerraAngel.class));
        cards.add(new SetCardInfo("Serra Aviary", 26, Rarity.UNCOMMON, mage.cards.s.SerraAviary.class));
        cards.add(new SetCardInfo("Serra Bestiary", 27, Rarity.COMMON, mage.cards.s.SerraBestiary.class));
        cards.add(new SetCardInfo("Shapeshifter", 226, Rarity.UNCOMMON, mage.cards.s.Shapeshifter.class));
        cards.add(new SetCardInfo("Shivan Dragon", 136, Rarity.RARE, mage.cards.s.ShivanDragon.class));
        cards.add(new SetCardInfo("Sinkhole", 97, Rarity.RARE, mage.cards.s.Sinkhole.class));
        cards.add(new SetCardInfo("Sleight of Hand", 62, Rarity.COMMON, mage.cards.s.SleightOfHand.class));
        cards.add(new SetCardInfo("Smoke", 137, Rarity.RARE, mage.cards.s.Smoke.class));
        cards.add(new SetCardInfo("Sol Ring", 227, Rarity.RARE, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Soldevi Golem", 228, Rarity.UNCOMMON, mage.cards.s.SoldeviGolem.class));
        cards.add(new SetCardInfo("Soldevi Machinist", 63, Rarity.UNCOMMON, mage.cards.s.SoldeviMachinist.class));
        cards.add(new SetCardInfo("Soul Shred", 98, Rarity.COMMON, mage.cards.s.SoulShred.class));
        cards.add(new SetCardInfo("Southern Elephant", 167, Rarity.COMMON, mage.cards.s.SouthernElephant.class));
        cards.add(new SetCardInfo("Spotted Griffin", 28, Rarity.COMMON, mage.cards.s.SpottedGriffin.class));
        cards.add(new SetCardInfo("Squall", 168, Rarity.UNCOMMON, mage.cards.s.Squall.class));
        cards.add(new SetCardInfo("Staff of Zegon", 229, Rarity.COMMON, mage.cards.s.StaffOfZegon.class));
        cards.add(new SetCardInfo("Stasis", 64, Rarity.RARE, mage.cards.s.Stasis.class));
        cards.add(new SetCardInfo("Steam Catapult", 29, Rarity.RARE, mage.cards.s.SteamCatapult.class));
        cards.add(new SetCardInfo("Strip Mine", 252, Rarity.RARE, mage.cards.s.StripMine.class));
        cards.add(new SetCardInfo("Swords to Plowshares", 30, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("Sylvan Tutor", 169, Rarity.UNCOMMON, mage.cards.s.SylvanTutor.class));
        cards.add(new SetCardInfo("Symbol of Unsummoning", 65, Rarity.COMMON, mage.cards.s.SymbolOfUnsummoning.class));
        cards.add(new SetCardInfo("Tablet of Epityr", 230, Rarity.COMMON, mage.cards.t.TabletOfEpityr.class));
        cards.add(new SetCardInfo("Taiga", 253, Rarity.RARE, mage.cards.t.Taiga.class));
        cards.add(new SetCardInfo("Talas Researcher", 66, Rarity.UNCOMMON, mage.cards.t.TalasResearcher.class));
        cards.add(new SetCardInfo("Tawnos's Wand", 231, Rarity.COMMON, mage.cards.t.TawnossWand.class));
        cards.add(new SetCardInfo("Tawnos's Weaponry", 232, Rarity.UNCOMMON, mage.cards.t.TawnossWeaponry.class));
        cards.add(new SetCardInfo("Temple Acolyte", 31, Rarity.COMMON, mage.cards.t.TempleAcolyte.class));
        cards.add(new SetCardInfo("Terror", 99, Rarity.COMMON, mage.cards.t.Terror.class));
        cards.add(new SetCardInfo("Tetravus", 233, Rarity.RARE, mage.cards.t.Tetravus.class));
        cards.add(new SetCardInfo("Theft of Dreams", 67, Rarity.UNCOMMON, mage.cards.t.TheftOfDreams.class));
        cards.add(new SetCardInfo("Thing from the Deep", 68, Rarity.RARE, mage.cards.t.ThingFromTheDeep.class));
        cards.add(new SetCardInfo("Thunder Dragon", 138, Rarity.RARE, mage.cards.t.ThunderDragon.class));
        cards.add(new SetCardInfo("Time Vault", 234, Rarity.RARE, mage.cards.t.TimeVault.class));
        cards.add(new SetCardInfo("Titania's Song", 170, Rarity.RARE, mage.cards.t.TitaniasSong.class));
        cards.add(new SetCardInfo("Transmute Artifact", 69, Rarity.RARE, mage.cards.t.TransmuteArtifact.class));
        cards.add(new SetCardInfo("Triassic Egg", 235, Rarity.RARE, mage.cards.t.TriassicEgg.class));
        cards.add(new SetCardInfo("Tropical Island", 254, Rarity.RARE, mage.cards.t.TropicalIsland.class));
        cards.add(new SetCardInfo("Tsunami", 171, Rarity.RARE, mage.cards.t.Tsunami.class));
        cards.add(new SetCardInfo("Tundra", 255, Rarity.RARE, mage.cards.t.Tundra.class));
        cards.add(new SetCardInfo("Two-Headed Giant of Foriys", 139, Rarity.UNCOMMON, mage.cards.t.TwoHeadedGiantOfForiys.class));
        cards.add(new SetCardInfo("Underground Sea", 256, Rarity.RARE, mage.cards.u.UndergroundSea.class));
        cards.add(new SetCardInfo("Urza's Chalice", 236, Rarity.COMMON, mage.cards.u.UrzasChalice.class));
        cards.add(new SetCardInfo("Urza's Mine", "257a", Rarity.COMMON, mage.cards.u.UrzasMine.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urza's Mine", "257b", Rarity.COMMON, mage.cards.u.UrzasMine.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urza's Mine", "257c", Rarity.COMMON, mage.cards.u.UrzasMine.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urza's Mine", "257d", Rarity.COMMON, mage.cards.u.UrzasMine.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urza's Miter", 237, Rarity.RARE, mage.cards.u.UrzasMiter.class));
        cards.add(new SetCardInfo("Urza's Power Plant", "258a", Rarity.COMMON, mage.cards.u.UrzasPowerPlant.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urza's Power Plant", "258b", Rarity.COMMON, mage.cards.u.UrzasPowerPlant.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urza's Power Plant", "258c", Rarity.COMMON, mage.cards.u.UrzasPowerPlant.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urza's Power Plant", "258d", Rarity.COMMON, mage.cards.u.UrzasPowerPlant.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urza's Tower", "259a", Rarity.COMMON, mage.cards.u.UrzasTower.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urza's Tower", "259b", Rarity.COMMON, mage.cards.u.UrzasTower.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urza's Tower", "259c", Rarity.COMMON, mage.cards.u.UrzasTower.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urza's Tower", "259d", Rarity.COMMON, mage.cards.u.UrzasTower.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Veteran Bodyguard", 32, Rarity.RARE, mage.cards.v.VeteranBodyguard.class));
        cards.add(new SetCardInfo("Vibrating Sphere", 238, Rarity.RARE, mage.cards.v.VibratingSphere.class));
        cards.add(new SetCardInfo("Volcanic Island", 260, Rarity.RARE, mage.cards.v.VolcanicIsland.class));
        cards.add(new SetCardInfo("War Mammoth", 172, Rarity.COMMON, mage.cards.w.WarMammoth.class));
        cards.add(new SetCardInfo("Warp Artifact", 100, Rarity.COMMON, mage.cards.w.WarpArtifact.class));
        cards.add(new SetCardInfo("Water Elemental", 70, Rarity.UNCOMMON, mage.cards.w.WaterElemental.class));
        cards.add(new SetCardInfo("Weakness", 101, Rarity.COMMON, mage.cards.w.Weakness.class));
        cards.add(new SetCardInfo("Weakstone", 239, Rarity.UNCOMMON, mage.cards.w.Weakstone.class));
        cards.add(new SetCardInfo("Wheel of Fortune", 140, Rarity.RARE, mage.cards.w.WheelOfFortune.class));
        cards.add(new SetCardInfo("Whiptail Wurm", 173, Rarity.UNCOMMON, mage.cards.w.WhiptailWurm.class));
        cards.add(new SetCardInfo("White Knight", 33, Rarity.UNCOMMON, mage.cards.w.WhiteKnight.class));
        cards.add(new SetCardInfo("Wicked Pact", 102, Rarity.UNCOMMON, mage.cards.w.WickedPact.class));
        cards.add(new SetCardInfo("Wild Aesthir", 34, Rarity.COMMON, mage.cards.w.WildAesthir.class));
        cards.add(new SetCardInfo("Wild Griffin", 35, Rarity.COMMON, mage.cards.w.WildGriffin.class));
        cards.add(new SetCardInfo("Wild Ox", 174, Rarity.UNCOMMON, mage.cards.w.WildOx.class));
        cards.add(new SetCardInfo("Wood Elemental", 175, Rarity.RARE, mage.cards.w.WoodElemental.class));
        cards.add(new SetCardInfo("Word of Command", 103, Rarity.RARE, mage.cards.w.WordOfCommand.class));
        cards.add(new SetCardInfo("Xenic Poltergeist", 104, Rarity.UNCOMMON, mage.cards.x.XenicPoltergeist.class));
        cards.add(new SetCardInfo("Yotian Soldier", 240, Rarity.COMMON, mage.cards.y.YotianSoldier.class));
        cards.add(new SetCardInfo("Zombie Master", 105, Rarity.UNCOMMON, mage.cards.z.ZombieMaster.class));
    }

    @Override
    protected List<CardInfo> findSpecialCardsByRarity(Rarity rarity) {
        List<CardInfo> cardInfos = super.findSpecialCardsByRarity(rarity);
        if (rarity == Rarity.LAND) {
            // Oasis is a normal common
            cardInfos.removeIf(cardInfo -> "Oasis".equals(cardInfo.getName()));
        }
        return cardInfos;
    }
}

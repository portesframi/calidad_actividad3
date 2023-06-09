package mage.sets;

import mage.cards.ExpansionSet;
import mage.cards.repository.CardCriteria;
import mage.cards.repository.CardInfo;
import mage.cards.repository.CardRepository;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.List;

public final class TimeSpiral extends ExpansionSet {

    private static final TimeSpiral instance = new TimeSpiral();

    public static TimeSpiral getInstance() {
        return instance;
    }

    private TimeSpiral() {
        super("Time Spiral", "TSP", ExpansionSet.buildDate(2006, 9, 9), SetType.EXPANSION);
        this.blockName = "Time Spiral";
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.numBoosterSpecial = 1;
        this.ratioBoosterMythic = 0;

        cards.add(new SetCardInfo("Academy Ruins", 269, Rarity.RARE, mage.cards.a.AcademyRuins.class));
        cards.add(new SetCardInfo("Aether Web", 189, Rarity.COMMON, mage.cards.a.AetherWeb.class));
        cards.add(new SetCardInfo("Aetherflame Wall", 142, Rarity.COMMON, mage.cards.a.AetherflameWall.class));
        cards.add(new SetCardInfo("Amrou Scout", 1, Rarity.COMMON, mage.cards.a.AmrouScout.class));
        cards.add(new SetCardInfo("Amrou Seekers", 2, Rarity.COMMON, mage.cards.a.AmrouSeekers.class));
        cards.add(new SetCardInfo("Ancestral Vision", 48, Rarity.RARE, mage.cards.a.AncestralVision.class));
        cards.add(new SetCardInfo("Ancient Grudge", 143, Rarity.COMMON, mage.cards.a.AncientGrudge.class));
        cards.add(new SetCardInfo("Angel's Grace", 3, Rarity.RARE, mage.cards.a.AngelsGrace.class));
        cards.add(new SetCardInfo("Ashcoat Bear", 190, Rarity.COMMON, mage.cards.a.AshcoatBear.class));
        cards.add(new SetCardInfo("Aspect of Mongoose", 191, Rarity.UNCOMMON, mage.cards.a.AspectOfMongoose.class));
        cards.add(new SetCardInfo("Assassinate", 95, Rarity.COMMON, mage.cards.a.Assassinate.class));
        cards.add(new SetCardInfo("Assembly-Worker", 248, Rarity.UNCOMMON, mage.cards.a.AssemblyWorker.class));
        cards.add(new SetCardInfo("Barbed Shocker", 144, Rarity.UNCOMMON, mage.cards.b.BarbedShocker.class));
        cards.add(new SetCardInfo("Basal Sliver", 96, Rarity.COMMON, mage.cards.b.BasalSliver.class));
        cards.add(new SetCardInfo("Basalt Gargoyle", 145, Rarity.UNCOMMON, mage.cards.b.BasaltGargoyle.class));
        cards.add(new SetCardInfo("Benalish Cavalry", 4, Rarity.COMMON, mage.cards.b.BenalishCavalry.class));
        cards.add(new SetCardInfo("Bewilder", 49, Rarity.COMMON, mage.cards.b.Bewilder.class));
        cards.add(new SetCardInfo("Blazing Blade Askari", 146, Rarity.COMMON, mage.cards.b.BlazingBladeAskari.class));
        cards.add(new SetCardInfo("Bogardan Hellkite", 147, Rarity.RARE, mage.cards.b.BogardanHellkite.class));
        cards.add(new SetCardInfo("Bogardan Rager", 148, Rarity.COMMON, mage.cards.b.BogardanRager.class));
        cards.add(new SetCardInfo("Bonesplitter Sliver", 149, Rarity.COMMON, mage.cards.b.BonesplitterSliver.class));
        cards.add(new SetCardInfo("Brass Gnat", 249, Rarity.COMMON, mage.cards.b.BrassGnat.class));
        cards.add(new SetCardInfo("Brine Elemental", 50, Rarity.UNCOMMON, mage.cards.b.BrineElemental.class));
        cards.add(new SetCardInfo("Calciform Pools", 270, Rarity.UNCOMMON, mage.cards.c.CalciformPools.class));
        cards.add(new SetCardInfo("Call to the Netherworld", 97, Rarity.COMMON, mage.cards.c.CallToTheNetherworld.class));
        cards.add(new SetCardInfo("Cancel", 51, Rarity.COMMON, mage.cards.c.Cancel.class));
        cards.add(new SetCardInfo("Candles of Leng", 250, Rarity.RARE, mage.cards.c.CandlesOfLeng.class));
        cards.add(new SetCardInfo("Careful Consideration", 52, Rarity.UNCOMMON, mage.cards.c.CarefulConsideration.class));
        cards.add(new SetCardInfo("Castle Raptors", 5, Rarity.COMMON, mage.cards.c.CastleRaptors.class));
        cards.add(new SetCardInfo("Cavalry Master", 6, Rarity.UNCOMMON, mage.cards.c.CavalryMaster.class));
        cards.add(new SetCardInfo("Celestial Crusader", 7, Rarity.UNCOMMON, mage.cards.c.CelestialCrusader.class));
        cards.add(new SetCardInfo("Chameleon Blur", 192, Rarity.COMMON, mage.cards.c.ChameleonBlur.class));
        cards.add(new SetCardInfo("Children of Korlis", 8, Rarity.COMMON, mage.cards.c.ChildrenOfKorlis.class));
        cards.add(new SetCardInfo("Chromatic Star", 251, Rarity.COMMON, mage.cards.c.ChromaticStar.class));
        cards.add(new SetCardInfo("Chronatog Totem", 252, Rarity.UNCOMMON, mage.cards.c.ChronatogTotem.class));
        cards.add(new SetCardInfo("Chronosavant", 9, Rarity.RARE, mage.cards.c.Chronosavant.class));
        cards.add(new SetCardInfo("Clockspinning", 53, Rarity.COMMON, mage.cards.c.Clockspinning.class));
        cards.add(new SetCardInfo("Clockwork Hydra", 253, Rarity.UNCOMMON, mage.cards.c.ClockworkHydra.class));
        cards.add(new SetCardInfo("Cloudchaser Kestrel", 10, Rarity.COMMON, mage.cards.c.CloudchaserKestrel.class));
        cards.add(new SetCardInfo("Coal Stoker", 150, Rarity.COMMON, mage.cards.c.CoalStoker.class));
        cards.add(new SetCardInfo("Conflagrate", 151, Rarity.UNCOMMON, mage.cards.c.Conflagrate.class));
        cards.add(new SetCardInfo("Coral Trickster", 54, Rarity.COMMON, mage.cards.c.CoralTrickster.class));
        cards.add(new SetCardInfo("Corpulent Corpse", 98, Rarity.COMMON, mage.cards.c.CorpulentCorpse.class));
        cards.add(new SetCardInfo("Crookclaw Transmuter", 55, Rarity.COMMON, mage.cards.c.CrookclawTransmuter.class));
        cards.add(new SetCardInfo("Curse of the Cabal", 99, Rarity.RARE, mage.cards.c.CurseOfTheCabal.class));
        cards.add(new SetCardInfo("Cyclopean Giant", 100, Rarity.COMMON, mage.cards.c.CyclopeanGiant.class));
        cards.add(new SetCardInfo("Dark Withering", 101, Rarity.COMMON, mage.cards.d.DarkWithering.class));
        cards.add(new SetCardInfo("D'Avenant Healer", 11, Rarity.COMMON, mage.cards.d.DAvenantHealer.class));
        cards.add(new SetCardInfo("Deathspore Thallid", 102, Rarity.COMMON, mage.cards.d.DeathsporeThallid.class));
        cards.add(new SetCardInfo("Deep-Sea Kraken", 56, Rarity.RARE, mage.cards.d.DeepSeaKraken.class));
        cards.add(new SetCardInfo("Dementia Sliver", 236, Rarity.UNCOMMON, mage.cards.d.DementiaSliver.class));
        cards.add(new SetCardInfo("Demonic Collusion", 103, Rarity.RARE, mage.cards.d.DemonicCollusion.class));
        cards.add(new SetCardInfo("Detainment Spell", 12, Rarity.COMMON, mage.cards.d.DetainmentSpell.class));
        cards.add(new SetCardInfo("Divine Congregation", 13, Rarity.COMMON, mage.cards.d.DivineCongregation.class));
        cards.add(new SetCardInfo("Draining Whelk", 57, Rarity.RARE, mage.cards.d.DrainingWhelk.class));
        cards.add(new SetCardInfo("Dralnu, Lich Lord", 237, Rarity.RARE, mage.cards.d.DralnuLichLord.class));
        cards.add(new SetCardInfo("Dread Return", 104, Rarity.UNCOMMON, mage.cards.d.DreadReturn.class));
        cards.add(new SetCardInfo("Dreadship Reef", 271, Rarity.UNCOMMON, mage.cards.d.DreadshipReef.class));
        cards.add(new SetCardInfo("Dream Stalker", 58, Rarity.COMMON, mage.cards.d.DreamStalker.class));
        cards.add(new SetCardInfo("Drifter il-Dal", 59, Rarity.COMMON, mage.cards.d.DrifterIlDal.class));
        cards.add(new SetCardInfo("Drudge Reavers", 105, Rarity.COMMON, mage.cards.d.DrudgeReavers.class));
        cards.add(new SetCardInfo("Durkwood Baloth", 193, Rarity.COMMON, mage.cards.d.DurkwoodBaloth.class));
        cards.add(new SetCardInfo("Durkwood Tracker", 194, Rarity.UNCOMMON, mage.cards.d.DurkwoodTracker.class));
        cards.add(new SetCardInfo("Duskrider Peregrine", 14, Rarity.UNCOMMON, mage.cards.d.DuskriderPeregrine.class));
        cards.add(new SetCardInfo("Empty the Warrens", 152, Rarity.COMMON, mage.cards.e.EmptyTheWarrens.class));
        cards.add(new SetCardInfo("Endrek Sahr, Master Breeder", 106, Rarity.RARE, mage.cards.e.EndrekSahrMasterBreeder.class));
        cards.add(new SetCardInfo("Errant Doomsayers", 15, Rarity.COMMON, mage.cards.e.ErrantDoomsayers.class));
        cards.add(new SetCardInfo("Errant Ephemeron", 60, Rarity.COMMON, mage.cards.e.ErrantEphemeron.class));
        cards.add(new SetCardInfo("Eternity Snare", 61, Rarity.COMMON, mage.cards.e.EternitySnare.class));
        cards.add(new SetCardInfo("Evangelize", 16, Rarity.RARE, mage.cards.e.Evangelize.class));
        cards.add(new SetCardInfo("Evil Eye of Urborg", 107, Rarity.UNCOMMON, mage.cards.e.EvilEyeOfUrborg.class));
        cards.add(new SetCardInfo("Faceless Devourer", 108, Rarity.UNCOMMON, mage.cards.f.FacelessDevourer.class));
        cards.add(new SetCardInfo("Fallen Ideal", 109, Rarity.UNCOMMON, mage.cards.f.FallenIdeal.class));
        cards.add(new SetCardInfo("Fathom Seer", 62, Rarity.COMMON, mage.cards.f.FathomSeer.class));
        cards.add(new SetCardInfo("Feebleness", 110, Rarity.COMMON, mage.cards.f.Feebleness.class));
        cards.add(new SetCardInfo("Firemaw Kavu", 153, Rarity.UNCOMMON, mage.cards.f.FiremawKavu.class));
        cards.add(new SetCardInfo("Firewake Sliver", 238, Rarity.UNCOMMON, mage.cards.f.FirewakeSliver.class));
        cards.add(new SetCardInfo("Flagstones of Trokair", 272, Rarity.RARE, mage.cards.f.FlagstonesOfTrokair.class));
        cards.add(new SetCardInfo("Flamecore Elemental", 154, Rarity.COMMON, mage.cards.f.FlamecoreElemental.class));
        cards.add(new SetCardInfo("Fledgling Mawcor", 63, Rarity.UNCOMMON, mage.cards.f.FledglingMawcor.class));
        cards.add(new SetCardInfo("Flickering Spirit", 17, Rarity.COMMON, mage.cards.f.FlickeringSpirit.class));
        cards.add(new SetCardInfo("Flowstone Channeler", 155, Rarity.COMMON, mage.cards.f.FlowstoneChanneler.class));
        cards.add(new SetCardInfo("Fool's Demise", 64, Rarity.UNCOMMON, mage.cards.f.FoolsDemise.class));
        cards.add(new SetCardInfo("Forest", 298, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 299, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 300, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 301, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Foriysian Interceptor", 18, Rarity.COMMON, mage.cards.f.ForiysianInterceptor.class));
        cards.add(new SetCardInfo("Foriysian Totem", 254, Rarity.UNCOMMON, mage.cards.f.ForiysianTotem.class));
        cards.add(new SetCardInfo("Fortify", 19, Rarity.COMMON, mage.cards.f.Fortify.class));
        cards.add(new SetCardInfo("Fortune Thief", 156, Rarity.RARE, mage.cards.f.FortuneThief.class));
        cards.add(new SetCardInfo("Fungal Reaches", 273, Rarity.UNCOMMON, mage.cards.f.FungalReaches.class));
        cards.add(new SetCardInfo("Fungus Sliver", 195, Rarity.RARE, mage.cards.f.FungusSliver.class));
        cards.add(new SetCardInfo("Fury Sliver", 157, Rarity.UNCOMMON, mage.cards.f.FurySliver.class));
        cards.add(new SetCardInfo("Gauntlet of Power", 255, Rarity.RARE, mage.cards.g.GauntletOfPower.class));
        cards.add(new SetCardInfo("Gaze of Justice", 20, Rarity.COMMON, mage.cards.g.GazeOfJustice.class));
        cards.add(new SetCardInfo("Gemhide Sliver", 196, Rarity.COMMON, mage.cards.g.GemhideSliver.class));
        cards.add(new SetCardInfo("Gemstone Caverns", 274, Rarity.RARE, mage.cards.g.GemstoneCaverns.class));
        cards.add(new SetCardInfo("Ghitu Firebreathing", 158, Rarity.COMMON, mage.cards.g.GhituFirebreathing.class));
        cards.add(new SetCardInfo("Ghostflame Sliver", 239, Rarity.UNCOMMON, mage.cards.g.GhostflameSliver.class));
        cards.add(new SetCardInfo("Glass Asp", 197, Rarity.COMMON, mage.cards.g.GlassAsp.class));
        cards.add(new SetCardInfo("Goblin Skycutter", 159, Rarity.COMMON, mage.cards.g.GoblinSkycutter.class));
        cards.add(new SetCardInfo("Gorgon Recluse", 111, Rarity.COMMON, mage.cards.g.GorgonRecluse.class));
        cards.add(new SetCardInfo("Grapeshot", 160, Rarity.COMMON, mage.cards.g.Grapeshot.class));
        cards.add(new SetCardInfo("Greater Gargadon", 161, Rarity.RARE, mage.cards.g.GreaterGargadon.class));
        cards.add(new SetCardInfo("Greenseeker", 198, Rarity.COMMON, mage.cards.g.Greenseeker.class));
        cards.add(new SetCardInfo("Griffin Guide", 21, Rarity.UNCOMMON, mage.cards.g.GriffinGuide.class));
        cards.add(new SetCardInfo("Ground Rift", 162, Rarity.COMMON, mage.cards.g.GroundRift.class));
        cards.add(new SetCardInfo("Gustcloak Cavalier", 22, Rarity.UNCOMMON, mage.cards.g.GustcloakCavalier.class));
        cards.add(new SetCardInfo("Harmonic Sliver", 240, Rarity.UNCOMMON, mage.cards.h.HarmonicSliver.class));
        cards.add(new SetCardInfo("Haunting Hymn", 112, Rarity.UNCOMMON, mage.cards.h.HauntingHymn.class));
        cards.add(new SetCardInfo("Havenwood Wurm", 199, Rarity.COMMON, mage.cards.h.HavenwoodWurm.class));
        cards.add(new SetCardInfo("Herd Gnarr", 200, Rarity.COMMON, mage.cards.h.HerdGnarr.class));
        cards.add(new SetCardInfo("Hivestone", 256, Rarity.RARE, mage.cards.h.Hivestone.class));
        cards.add(new SetCardInfo("Hypergenesis", 201, Rarity.RARE, mage.cards.h.Hypergenesis.class));
        cards.add(new SetCardInfo("Ib Halfheart, Goblin Tactician", 163, Rarity.RARE, mage.cards.i.IbHalfheartGoblinTactician.class));
        cards.add(new SetCardInfo("Icatian Crier", 23, Rarity.COMMON, mage.cards.i.IcatianCrier.class));
        cards.add(new SetCardInfo("Ignite Memories", 164, Rarity.UNCOMMON, mage.cards.i.IgniteMemories.class));
        cards.add(new SetCardInfo("Ironclaw Buzzardiers", 165, Rarity.COMMON, mage.cards.i.IronclawBuzzardiers.class));
        cards.add(new SetCardInfo("Island", 286, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 287, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 288, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 289, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ith, High Arcanist", 241, Rarity.RARE, mage.cards.i.IthHighArcanist.class));
        cards.add(new SetCardInfo("Ivory Giant", 24, Rarity.COMMON, mage.cards.i.IvoryGiant.class));
        cards.add(new SetCardInfo("Ixidron", 65, Rarity.RARE, mage.cards.i.Ixidron.class));
        cards.add(new SetCardInfo("Jaya Ballard, Task Mage", 166, Rarity.RARE, mage.cards.j.JayaBallardTaskMage.class));
        cards.add(new SetCardInfo("Jedit's Dragoons", 25, Rarity.COMMON, mage.cards.j.JeditsDragoons.class));
        cards.add(new SetCardInfo("Jhoira's Timebug", 257, Rarity.COMMON, mage.cards.j.JhoirasTimebug.class));
        cards.add(new SetCardInfo("Kaervek the Merciless", 242, Rarity.RARE, mage.cards.k.KaervekTheMerciless.class));
        cards.add(new SetCardInfo("Keldon Halberdier", 167, Rarity.COMMON, mage.cards.k.KeldonHalberdier.class));
        cards.add(new SetCardInfo("Kher Keep", 275, Rarity.RARE, mage.cards.k.KherKeep.class));
        cards.add(new SetCardInfo("Knight of the Holy Nimbus", 26, Rarity.UNCOMMON, mage.cards.k.KnightOfTheHolyNimbus.class));
        cards.add(new SetCardInfo("Krosan Grip", 202, Rarity.UNCOMMON, mage.cards.k.KrosanGrip.class));
        cards.add(new SetCardInfo("Liege of the Pit", 113, Rarity.RARE, mage.cards.l.LiegeOfThePit.class));
        cards.add(new SetCardInfo("Lightning Axe", 168, Rarity.COMMON, mage.cards.l.LightningAxe.class));
        cards.add(new SetCardInfo("Lim-Dul the Necromancer", 114, Rarity.RARE, mage.cards.l.LimDulTheNecromancer.class));
        cards.add(new SetCardInfo("Living End", 115, Rarity.RARE, mage.cards.l.LivingEnd.class));
        cards.add(new SetCardInfo("Locket of Yesterdays", 258, Rarity.UNCOMMON, mage.cards.l.LocketOfYesterdays.class));
        cards.add(new SetCardInfo("Looter il-Kor", 66, Rarity.COMMON, mage.cards.l.LooterIlKor.class));
        cards.add(new SetCardInfo("Lotus Bloom", 259, Rarity.RARE, mage.cards.l.LotusBloom.class));
        cards.add(new SetCardInfo("Magus of the Candelabra", 203, Rarity.RARE, mage.cards.m.MagusOfTheCandelabra.class));
        cards.add(new SetCardInfo("Magus of the Disk", 27, Rarity.RARE, mage.cards.m.MagusOfTheDisk.class));
        cards.add(new SetCardInfo("Magus of the Jar", 67, Rarity.RARE, mage.cards.m.MagusOfTheJar.class));
        cards.add(new SetCardInfo("Magus of the Mirror", 116, Rarity.RARE, mage.cards.m.MagusOfTheMirror.class));
        cards.add(new SetCardInfo("Magus of the Scroll", 169, Rarity.RARE, mage.cards.m.MagusOfTheScroll.class));
        cards.add(new SetCardInfo("Mana Skimmer", 117, Rarity.COMMON, mage.cards.m.ManaSkimmer.class));
        cards.add(new SetCardInfo("Mangara of Corondor", 28, Rarity.RARE, mage.cards.m.MangaraOfCorondor.class));
        cards.add(new SetCardInfo("Might of Old Krosa", 204, Rarity.UNCOMMON, mage.cards.m.MightOfOldKrosa.class));
        cards.add(new SetCardInfo("Might Sliver", 205, Rarity.UNCOMMON, mage.cards.m.MightSliver.class));
        cards.add(new SetCardInfo("Mindlash Sliver", 118, Rarity.COMMON, mage.cards.m.MindlashSliver.class));
        cards.add(new SetCardInfo("Mindstab", 119, Rarity.COMMON, mage.cards.m.Mindstab.class));
        cards.add(new SetCardInfo("Mishra, Artificer Prodigy", 243, Rarity.RARE, mage.cards.m.MishraArtificerProdigy.class));
        cards.add(new SetCardInfo("Mogg War Marshal", 170, Rarity.COMMON, mage.cards.m.MoggWarMarshal.class));
        cards.add(new SetCardInfo("Molder", 206, Rarity.COMMON, mage.cards.m.Molder.class));
        cards.add(new SetCardInfo("Molten Slagheap", 276, Rarity.UNCOMMON, mage.cards.m.MoltenSlagheap.class));
        cards.add(new SetCardInfo("Momentary Blink", 29, Rarity.COMMON, mage.cards.m.MomentaryBlink.class));
        cards.add(new SetCardInfo("Moonlace", 68, Rarity.RARE, mage.cards.m.Moonlace.class));
        cards.add(new SetCardInfo("Mountain", 294, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 295, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 296, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 297, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mwonvuli Acid-Moss", 207, Rarity.COMMON, mage.cards.m.MwonvuliAcidMoss.class));
        cards.add(new SetCardInfo("Mystical Teachings", 69, Rarity.COMMON, mage.cards.m.MysticalTeachings.class));
        cards.add(new SetCardInfo("Nantuko Shaman", 208, Rarity.COMMON, mage.cards.n.NantukoShaman.class));
        cards.add(new SetCardInfo("Nether Traitor", 120, Rarity.RARE, mage.cards.n.NetherTraitor.class));
        cards.add(new SetCardInfo("Nightshade Assassin", 121, Rarity.UNCOMMON, mage.cards.n.NightshadeAssassin.class));
        cards.add(new SetCardInfo("Norin the Wary", 171, Rarity.RARE, mage.cards.n.NorinTheWary.class));
        cards.add(new SetCardInfo("Opal Guardian", 30, Rarity.RARE, mage.cards.o.OpalGuardian.class));
        cards.add(new SetCardInfo("Opaline Sliver", 244, Rarity.UNCOMMON, mage.cards.o.OpalineSliver.class));
        cards.add(new SetCardInfo("Ophidian Eye", 70, Rarity.COMMON, mage.cards.o.OphidianEye.class));
        cards.add(new SetCardInfo("Orcish Cannonade", 172, Rarity.COMMON, mage.cards.o.OrcishCannonade.class));
        cards.add(new SetCardInfo("Outrider en-Kor", 31, Rarity.UNCOMMON, mage.cards.o.OutriderEnKor.class));
        cards.add(new SetCardInfo("Paradise Plume", 260, Rarity.UNCOMMON, mage.cards.p.ParadisePlume.class));
        cards.add(new SetCardInfo("Paradox Haze", 71, Rarity.UNCOMMON, mage.cards.p.ParadoxHaze.class));
        cards.add(new SetCardInfo("Pardic Dragon", 173, Rarity.RARE, mage.cards.p.PardicDragon.class));
        cards.add(new SetCardInfo("Pendelhaven Elder", 209, Rarity.UNCOMMON, mage.cards.p.PendelhavenElder.class));
        cards.add(new SetCardInfo("Pentarch Paladin", 32, Rarity.RARE, mage.cards.p.PentarchPaladin.class));
        cards.add(new SetCardInfo("Pentarch Ward", 33, Rarity.COMMON, mage.cards.p.PentarchWard.class));
        cards.add(new SetCardInfo("Penumbra Spider", 210, Rarity.COMMON, mage.cards.p.PenumbraSpider.class));
        cards.add(new SetCardInfo("Phantom Wurm", 211, Rarity.UNCOMMON, mage.cards.p.PhantomWurm.class));
        cards.add(new SetCardInfo("Phthisis", 122, Rarity.UNCOMMON, mage.cards.p.Phthisis.class));
        cards.add(new SetCardInfo("Phyrexian Totem", 261, Rarity.UNCOMMON, mage.cards.p.PhyrexianTotem.class));
        cards.add(new SetCardInfo("Pit Keeper", 123, Rarity.COMMON, mage.cards.p.PitKeeper.class));
        cards.add(new SetCardInfo("Plague Sliver", 124, Rarity.RARE, mage.cards.p.PlagueSliver.class));
        cards.add(new SetCardInfo("Plains", 282, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 283, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 284, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 285, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plated Pegasus", 34, Rarity.UNCOMMON, mage.cards.p.PlatedPegasus.class));
        cards.add(new SetCardInfo("Plunder", 174, Rarity.COMMON, mage.cards.p.Plunder.class));
        cards.add(new SetCardInfo("Premature Burial", 125, Rarity.UNCOMMON, mage.cards.p.PrematureBurial.class));
        cards.add(new SetCardInfo("Primal Forcemage", 212, Rarity.UNCOMMON, mage.cards.p.PrimalForcemage.class));
        cards.add(new SetCardInfo("Prismatic Lens", 262, Rarity.COMMON, mage.cards.p.PrismaticLens.class));
        cards.add(new SetCardInfo("Psionic Sliver", 72, Rarity.RARE, mage.cards.p.PsionicSliver.class));
        cards.add(new SetCardInfo("Psychotic Episode", 126, Rarity.COMMON, mage.cards.p.PsychoticEpisode.class));
        cards.add(new SetCardInfo("Pull from Eternity", 35, Rarity.UNCOMMON, mage.cards.p.PullFromEternity.class));
        cards.add(new SetCardInfo("Pulmonic Sliver", 36, Rarity.RARE, mage.cards.p.PulmonicSliver.class));
        cards.add(new SetCardInfo("Quilled Sliver", 37, Rarity.UNCOMMON, mage.cards.q.QuilledSliver.class));
        cards.add(new SetCardInfo("Reiterate", 175, Rarity.RARE, mage.cards.r.Reiterate.class));
        cards.add(new SetCardInfo("Restore Balance", 38, Rarity.RARE, mage.cards.r.RestoreBalance.class));
        cards.add(new SetCardInfo("Return to Dust", 39, Rarity.UNCOMMON, mage.cards.r.ReturnToDust.class));
        cards.add(new SetCardInfo("Rift Bolt", 176, Rarity.COMMON, mage.cards.r.RiftBolt.class));
        cards.add(new SetCardInfo("Riftwing Cloudskate", 73, Rarity.UNCOMMON, mage.cards.r.RiftwingCloudskate.class));
        cards.add(new SetCardInfo("Saffi Eriksdotter", 245, Rarity.RARE, mage.cards.s.SaffiEriksdotter.class));
        cards.add(new SetCardInfo("Sage of Epityr", 74, Rarity.COMMON, mage.cards.s.SageOfEpityr.class));
        cards.add(new SetCardInfo("Saltcrusted Steppe", 277, Rarity.UNCOMMON, mage.cards.s.SaltcrustedSteppe.class));
        cards.add(new SetCardInfo("Sangrophage", 127, Rarity.COMMON, mage.cards.s.Sangrophage.class));
        cards.add(new SetCardInfo("Sarpadian Empires, Vol. VII", 263, Rarity.RARE, mage.cards.s.SarpadianEmpiresVolVII.class));
        cards.add(new SetCardInfo("Savage Thallid", 213, Rarity.COMMON, mage.cards.s.SavageThallid.class));
        cards.add(new SetCardInfo("Scarwood Treefolk", 214, Rarity.COMMON, mage.cards.s.ScarwoodTreefolk.class));
        cards.add(new SetCardInfo("Scion of the Ur-Dragon", 246, Rarity.RARE, mage.cards.s.ScionOfTheUrDragon.class));
        cards.add(new SetCardInfo("Screeching Sliver", 75, Rarity.COMMON, mage.cards.s.ScreechingSliver.class));
        cards.add(new SetCardInfo("Scryb Ranger", 215, Rarity.UNCOMMON, mage.cards.s.ScrybRanger.class));
        cards.add(new SetCardInfo("Search for Tomorrow", 216, Rarity.COMMON, mage.cards.s.SearchForTomorrow.class));
        cards.add(new SetCardInfo("Sedge Sliver", 177, Rarity.RARE, mage.cards.s.SedgeSliver.class));
        cards.add(new SetCardInfo("Sengir Nosferatu", 128, Rarity.RARE, mage.cards.s.SengirNosferatu.class));
        cards.add(new SetCardInfo("Serra Avenger", 40, Rarity.RARE, mage.cards.s.SerraAvenger.class));
        cards.add(new SetCardInfo("Shadow Sliver", 76, Rarity.COMMON, mage.cards.s.ShadowSliver.class));
        cards.add(new SetCardInfo("Sidewinder Sliver", 41, Rarity.COMMON, mage.cards.s.SidewinderSliver.class));
        cards.add(new SetCardInfo("Skittering Monstrosity", 129, Rarity.UNCOMMON, mage.cards.s.SkitteringMonstrosity.class));
        cards.add(new SetCardInfo("Skulking Knight", 130, Rarity.COMMON, mage.cards.s.SkulkingKnight.class));
        cards.add(new SetCardInfo("Slipstream Serpent", 77, Rarity.COMMON, mage.cards.s.SlipstreamSerpent.class));
        cards.add(new SetCardInfo("Smallpox", 131, Rarity.UNCOMMON, mage.cards.s.Smallpox.class));
        cards.add(new SetCardInfo("Snapback", 78, Rarity.COMMON, mage.cards.s.Snapback.class));
        cards.add(new SetCardInfo("Spectral Force", 217, Rarity.RARE, mage.cards.s.SpectralForce.class));
        cards.add(new SetCardInfo("Spell Burst", 79, Rarity.UNCOMMON, mage.cards.s.SpellBurst.class));
        cards.add(new SetCardInfo("Spiketail Drakeling", 80, Rarity.COMMON, mage.cards.s.SpiketailDrakeling.class));
        cards.add(new SetCardInfo("Spike Tiller", 218, Rarity.RARE, mage.cards.s.SpikeTiller.class));
        cards.add(new SetCardInfo("Spinneret Sliver", 219, Rarity.COMMON, mage.cards.s.SpinneretSliver.class));
        cards.add(new SetCardInfo("Spirit Loop", 42, Rarity.UNCOMMON, mage.cards.s.SpiritLoop.class));
        cards.add(new SetCardInfo("Sporesower Thallid", 220, Rarity.UNCOMMON, mage.cards.s.SporesowerThallid.class));
        cards.add(new SetCardInfo("Sprite Noble", 81, Rarity.RARE, mage.cards.s.SpriteNoble.class));
        cards.add(new SetCardInfo("Sprout", 221, Rarity.COMMON, mage.cards.s.Sprout.class));
        cards.add(new SetCardInfo("Squall Line", 222, Rarity.RARE, mage.cards.s.SquallLine.class));
        cards.add(new SetCardInfo("Stonebrow, Krosan Hero", 247, Rarity.RARE, mage.cards.s.StonebrowKrosanHero.class));
        cards.add(new SetCardInfo("Stonewood Invocation", 223, Rarity.RARE, mage.cards.s.StonewoodInvocation.class));
        cards.add(new SetCardInfo("Stormcloud Djinn", 82, Rarity.UNCOMMON, mage.cards.s.StormcloudDjinn.class));
        cards.add(new SetCardInfo("Strangling Soot", 132, Rarity.COMMON, mage.cards.s.StranglingSoot.class));
        cards.add(new SetCardInfo("Strength in Numbers", 224, Rarity.COMMON, mage.cards.s.StrengthInNumbers.class));
        cards.add(new SetCardInfo("Stronghold Overseer", 133, Rarity.RARE, mage.cards.s.StrongholdOverseer.class));
        cards.add(new SetCardInfo("Stuffy Doll", 264, Rarity.RARE, mage.cards.s.StuffyDoll.class));
        cards.add(new SetCardInfo("Subterranean Shambler", 178, Rarity.COMMON, mage.cards.s.SubterraneanShambler.class));
        cards.add(new SetCardInfo("Sudden Death", 134, Rarity.UNCOMMON, mage.cards.s.SuddenDeath.class));
        cards.add(new SetCardInfo("Sudden Shock", 179, Rarity.UNCOMMON, mage.cards.s.SuddenShock.class));
        cards.add(new SetCardInfo("Sudden Spoiling", 135, Rarity.RARE, mage.cards.s.SuddenSpoiling.class));
        cards.add(new SetCardInfo("Sulfurous Blast", 180, Rarity.UNCOMMON, mage.cards.s.SulfurousBlast.class));
        cards.add(new SetCardInfo("Swamp", 290, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 291, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 292, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 293, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swarmyard", 278, Rarity.RARE, mage.cards.s.Swarmyard.class));
        cards.add(new SetCardInfo("Tectonic Fiend", 181, Rarity.UNCOMMON, mage.cards.t.TectonicFiend.class));
        cards.add(new SetCardInfo("Teferi, Mage of Zhalfir", 83, Rarity.RARE, mage.cards.t.TeferiMageOfZhalfir.class));
        cards.add(new SetCardInfo("Telekinetic Sliver", 84, Rarity.UNCOMMON, mage.cards.t.TelekineticSliver.class));
        cards.add(new SetCardInfo("Temporal Eddy", 85, Rarity.COMMON, mage.cards.t.TemporalEddy.class));
        cards.add(new SetCardInfo("Temporal Isolation", 43, Rarity.COMMON, mage.cards.t.TemporalIsolation.class));
        cards.add(new SetCardInfo("Tendrils of Corruption", 136, Rarity.COMMON, mage.cards.t.TendrilsOfCorruption.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 279, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Thallid Germinator", 225, Rarity.COMMON, mage.cards.t.ThallidGerminator.class));
        cards.add(new SetCardInfo("Thallid Shell-Dweller", 226, Rarity.COMMON, mage.cards.t.ThallidShellDweller.class));
        cards.add(new SetCardInfo("Thelonite Hermit", 228, Rarity.RARE, mage.cards.t.TheloniteHermit.class));
        cards.add(new SetCardInfo("Thelon of Havenwood", 227, Rarity.RARE, mage.cards.t.ThelonOfHavenwood.class));
        cards.add(new SetCardInfo("Thick-Skinned Goblin", 182, Rarity.UNCOMMON, mage.cards.t.ThickSkinnedGoblin.class));
        cards.add(new SetCardInfo("Think Twice", 86, Rarity.COMMON, mage.cards.t.ThinkTwice.class));
        cards.add(new SetCardInfo("Thrill of the Hunt", 229, Rarity.COMMON, mage.cards.t.ThrillOfTheHunt.class));
        cards.add(new SetCardInfo("Thunder Totem", 265, Rarity.UNCOMMON, mage.cards.t.ThunderTotem.class));
        cards.add(new SetCardInfo("Tivadar of Thorn", 44, Rarity.RARE, mage.cards.t.TivadarOfThorn.class));
        cards.add(new SetCardInfo("Tolarian Sentinel", 87, Rarity.COMMON, mage.cards.t.TolarianSentinel.class));
        cards.add(new SetCardInfo("Traitor's Clutch", 137, Rarity.COMMON, mage.cards.t.TraitorsClutch.class));
        cards.add(new SetCardInfo("Trespasser il-Vec", 138, Rarity.COMMON, mage.cards.t.TrespasserIlVec.class));
        cards.add(new SetCardInfo("Trickbind", 88, Rarity.RARE, mage.cards.t.Trickbind.class));
        cards.add(new SetCardInfo("Triskelavus", 266, Rarity.RARE, mage.cards.t.Triskelavus.class));
        cards.add(new SetCardInfo("Tromp the Domains", 230, Rarity.UNCOMMON, mage.cards.t.TrompTheDomains.class));
        cards.add(new SetCardInfo("Truth or Tale", 89, Rarity.UNCOMMON, mage.cards.t.TruthOrTale.class));
        cards.add(new SetCardInfo("Two-Headed Sliver", 183, Rarity.COMMON, mage.cards.t.TwoHeadedSliver.class));
        cards.add(new SetCardInfo("Undying Rage", 184, Rarity.UNCOMMON, mage.cards.u.UndyingRage.class));
        cards.add(new SetCardInfo("Unyaro Bees", 231, Rarity.RARE, mage.cards.u.UnyaroBees.class));
        cards.add(new SetCardInfo("Urborg Syphon-Mage", 139, Rarity.COMMON, mage.cards.u.UrborgSyphonMage.class));
        cards.add(new SetCardInfo("Urza's Factory", 280, Rarity.UNCOMMON, mage.cards.u.UrzasFactory.class));
        cards.add(new SetCardInfo("Vampiric Sliver", 140, Rarity.UNCOMMON, mage.cards.v.VampiricSliver.class));
        cards.add(new SetCardInfo("Venser's Sliver", 267, Rarity.COMMON, mage.cards.v.VensersSliver.class));
        cards.add(new SetCardInfo("Verdant Embrace", 232, Rarity.RARE, mage.cards.v.VerdantEmbrace.class));
        cards.add(new SetCardInfo("Vesuva", 281, Rarity.RARE, mage.cards.v.Vesuva.class));
        cards.add(new SetCardInfo("Vesuvan Shapeshifter", 90, Rarity.RARE, mage.cards.v.VesuvanShapeshifter.class));
        cards.add(new SetCardInfo("Viashino Bladescout", 185, Rarity.COMMON, mage.cards.v.ViashinoBladescout.class));
        cards.add(new SetCardInfo("Viscerid Deepwalker", 91, Rarity.COMMON, mage.cards.v.VisceridDeepwalker.class));
        cards.add(new SetCardInfo("Viscid Lemures", 141, Rarity.COMMON, mage.cards.v.ViscidLemures.class));
        cards.add(new SetCardInfo("Voidmage Husher", 92, Rarity.UNCOMMON, mage.cards.v.VoidmageHusher.class));
        cards.add(new SetCardInfo("Volcanic Awakening", 186, Rarity.UNCOMMON, mage.cards.v.VolcanicAwakening.class));
        cards.add(new SetCardInfo("Walk the Aeons", 93, Rarity.RARE, mage.cards.w.WalkTheAeons.class));
        cards.add(new SetCardInfo("Watcher Sliver", 45, Rarity.COMMON, mage.cards.w.WatcherSliver.class));
        cards.add(new SetCardInfo("Weathered Bodyguards", 46, Rarity.RARE, mage.cards.w.WeatheredBodyguards.class));
        cards.add(new SetCardInfo("Weatherseed Totem", 268, Rarity.UNCOMMON, mage.cards.w.WeatherseedTotem.class));
        cards.add(new SetCardInfo("Wheel of Fate", 187, Rarity.RARE, mage.cards.w.WheelOfFate.class));
        cards.add(new SetCardInfo("Wipe Away", 94, Rarity.UNCOMMON, mage.cards.w.WipeAway.class));
        cards.add(new SetCardInfo("Word of Seizing", 188, Rarity.RARE, mage.cards.w.WordOfSeizing.class));
        cards.add(new SetCardInfo("Wormwood Dryad", 233, Rarity.COMMON, mage.cards.w.WormwoodDryad.class));
        cards.add(new SetCardInfo("Wurmcalling", 234, Rarity.RARE, mage.cards.w.Wurmcalling.class));
        cards.add(new SetCardInfo("Yavimaya Dryad", 235, Rarity.UNCOMMON, mage.cards.y.YavimayaDryad.class));
        cards.add(new SetCardInfo("Zealot il-Vec", 47, Rarity.COMMON, mage.cards.z.ZealotIlVec.class));
    }

    @Override
    protected List<CardInfo> findCardsByRarity(Rarity rarity) {
        List<CardInfo> cardInfos = super.findCardsByRarity(rarity);
        if (rarity == Rarity.SPECIAL) {
            cardInfos.addAll(CardRepository.instance.findCards(new CardCriteria().setCodes("TSB")));
        }
        return cardInfos;
    }
}

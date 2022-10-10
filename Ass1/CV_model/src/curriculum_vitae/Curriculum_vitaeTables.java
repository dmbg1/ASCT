/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /CV_model/model/cv_model.ecore
 * using:
 *   /CV_model/model/cv_generator.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package curriculum_vitae;

// import curriculum_vitae.Curriculum_vitaePackage;
// import curriculum_vitae.Curriculum_vitaeTables;
import java.lang.String;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * Curriculum_vitaeTables provides the dispatch tables for the curriculum_vitae for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Curriculum_vitaeTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Curriculum_vitaePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_curriculum_vitae = IdManager.getNsURIPackageId("https://curriculum_vitae", null, Curriculum_vitaePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Activity = Curriculum_vitaeTables.PACKid_https_c_s_s_curriculum_vitae.getClassId("Activity", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ActivityType = Curriculum_vitaeTables.PACKid_https_c_s_s_curriculum_vitae.getClassId("ActivityType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Affiliation = Curriculum_vitaeTables.PACKid_https_c_s_s_curriculum_vitae.getClassId("Affiliation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AffiliationField = Curriculum_vitaeTables.PACKid_https_c_s_s_curriculum_vitae.getClassId("AffiliationField", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CitationName = Curriculum_vitaeTables.PACKid_https_c_s_s_curriculum_vitae.getClassId("CitationName", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CurriculumVitae = Curriculum_vitaeTables.PACKid_https_c_s_s_curriculum_vitae.getClassId("CurriculumVitae", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Degree = Curriculum_vitaeTables.PACKid_https_c_s_s_curriculum_vitae.getClassId("Degree", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Distinction = Curriculum_vitaeTables.PACKid_https_c_s_s_curriculum_vitae.getClassId("Distinction", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DistinctionType = Curriculum_vitaeTables.PACKid_https_c_s_s_curriculum_vitae.getClassId("DistinctionType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Idiom = Curriculum_vitaeTables.PACKid_https_c_s_s_curriculum_vitae.getClassId("Idiom", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Person = Curriculum_vitaeTables.PACKid_https_c_s_s_curriculum_vitae.getClassId("Person", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Project = Curriculum_vitaeTables.PACKid_https_c_s_s_curriculum_vitae.getClassId("Project", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Technology = Curriculum_vitaeTables.PACKid_https_c_s_s_curriculum_vitae.getClassId("Technology", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Website = Curriculum_vitaeTables.PACKid_https_c_s_s_curriculum_vitae.getClassId("Website", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = Curriculum_vitaeTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Curriculum_vitaeTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_5 = ValueUtil.integerValueOf("5");
	public static final /*@NonInvalid*/ CollectionTypeId SET_PRIMid_String = TypeId.SET.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ String STR_A1 = "A1";
	public static final /*@NonInvalid*/ String STR_A2 = "A2";
	public static final /*@NonInvalid*/ String STR_B1 = "B1";
	public static final /*@NonInvalid*/ String STR_B2 = "B2";
	public static final /*@NonInvalid*/ String STR_C1 = "C1";
	public static final /*@NonInvalid*/ String STR_C2 = "C2";
	public static final /*@NonInvalid*/ String STR_a1 = "a1";
	public static final /*@NonInvalid*/ String STR_a2 = "a2";
	public static final /*@NonInvalid*/ String STR_b1 = "b1";
	public static final /*@NonInvalid*/ String STR_b2 = "b2";
	public static final /*@NonInvalid*/ String STR_c1 = "c1";
	public static final /*@NonInvalid*/ String STR_c2 = "c2";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Person = TypeId.BAG.getSpecializedId(Curriculum_vitaeTables.CLSSid_Person);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Activity = TypeId.ORDERED_SET.getSpecializedId(Curriculum_vitaeTables.CLSSid_Activity);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ActivityType = TypeId.ORDERED_SET.getSpecializedId(Curriculum_vitaeTables.CLSSid_ActivityType);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Affiliation = TypeId.ORDERED_SET.getSpecializedId(Curriculum_vitaeTables.CLSSid_Affiliation);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AffiliationField = TypeId.ORDERED_SET.getSpecializedId(Curriculum_vitaeTables.CLSSid_AffiliationField);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_CitationName = TypeId.ORDERED_SET.getSpecializedId(Curriculum_vitaeTables.CLSSid_CitationName);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Degree = TypeId.ORDERED_SET.getSpecializedId(Curriculum_vitaeTables.CLSSid_Degree);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Distinction = TypeId.ORDERED_SET.getSpecializedId(Curriculum_vitaeTables.CLSSid_Distinction);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DistinctionType = TypeId.ORDERED_SET.getSpecializedId(Curriculum_vitaeTables.CLSSid_DistinctionType);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Idiom = TypeId.ORDERED_SET.getSpecializedId(Curriculum_vitaeTables.CLSSid_Idiom);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Project = TypeId.ORDERED_SET.getSpecializedId(Curriculum_vitaeTables.CLSSid_Project);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Technology = TypeId.ORDERED_SET.getSpecializedId(Curriculum_vitaeTables.CLSSid_Technology);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Website = TypeId.ORDERED_SET.getSpecializedId(Curriculum_vitaeTables.CLSSid_Website);
	public static final /*@NonInvalid*/ SetValue Set_0 = ValueUtil.createSetOfEach(Curriculum_vitaeTables.SET_PRIMid_String, Curriculum_vitaeTables.STR_C1, Curriculum_vitaeTables.STR_c1, Curriculum_vitaeTables.STR_C2, Curriculum_vitaeTables.STR_c2, Curriculum_vitaeTables.STR_B1, Curriculum_vitaeTables.STR_b1, Curriculum_vitaeTables.STR_B2, Curriculum_vitaeTables.STR_b2, Curriculum_vitaeTables.STR_A1, Curriculum_vitaeTables.STR_a1, Curriculum_vitaeTables.STR_A2, Curriculum_vitaeTables.STR_a2);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Curriculum_vitaeTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Curriculum_vitaeTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Activity = new EcoreExecutorType(Curriculum_vitaePackage.Literals.ACTIVITY, PACKAGE, 0);
		public static final EcoreExecutorType _ActivityType = new EcoreExecutorType(Curriculum_vitaePackage.Literals.ACTIVITY_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Affiliation = new EcoreExecutorType(Curriculum_vitaePackage.Literals.AFFILIATION, PACKAGE, 0);
		public static final EcoreExecutorType _AffiliationField = new EcoreExecutorType(Curriculum_vitaePackage.Literals.AFFILIATION_FIELD, PACKAGE, 0);
		public static final EcoreExecutorType _CitationName = new EcoreExecutorType(Curriculum_vitaePackage.Literals.CITATION_NAME, PACKAGE, 0);
		public static final EcoreExecutorType _CurriculumVitae = new EcoreExecutorType(Curriculum_vitaePackage.Literals.CURRICULUM_VITAE, PACKAGE, 0);
		public static final EcoreExecutorType _Degree = new EcoreExecutorType(Curriculum_vitaePackage.Literals.DEGREE, PACKAGE, 0);
		public static final EcoreExecutorType _Distinction = new EcoreExecutorType(Curriculum_vitaePackage.Literals.DISTINCTION, PACKAGE, 0);
		public static final EcoreExecutorType _DistinctionType = new EcoreExecutorType(Curriculum_vitaePackage.Literals.DISTINCTION_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Idiom = new EcoreExecutorType(Curriculum_vitaePackage.Literals.IDIOM, PACKAGE, 0);
		public static final EcoreExecutorType _Person = new EcoreExecutorType(Curriculum_vitaePackage.Literals.PERSON, PACKAGE, 0);
		public static final EcoreExecutorType _Project = new EcoreExecutorType(Curriculum_vitaePackage.Literals.PROJECT, PACKAGE, 0);
		public static final EcoreExecutorType _Technology = new EcoreExecutorType(Curriculum_vitaePackage.Literals.TECHNOLOGY, PACKAGE, 0);
		public static final EcoreExecutorType _Website = new EcoreExecutorType(Curriculum_vitaePackage.Literals.WEBSITE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Activity,
			_ActivityType,
			_Affiliation,
			_AffiliationField,
			_CitationName,
			_CurriculumVitae,
			_Degree,
			_Distinction,
			_DistinctionType,
			_Idiom,
			_Person,
			_Project,
			_Technology,
			_Website
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Curriculum_vitaeTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Activity__Activity = new ExecutorFragment(Types._Activity, Curriculum_vitaeTables.Types._Activity);
		private static final ExecutorFragment _Activity__OclAny = new ExecutorFragment(Types._Activity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Activity__OclElement = new ExecutorFragment(Types._Activity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ActivityType__ActivityType = new ExecutorFragment(Types._ActivityType, Curriculum_vitaeTables.Types._ActivityType);
		private static final ExecutorFragment _ActivityType__OclAny = new ExecutorFragment(Types._ActivityType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ActivityType__OclElement = new ExecutorFragment(Types._ActivityType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Affiliation__Affiliation = new ExecutorFragment(Types._Affiliation, Curriculum_vitaeTables.Types._Affiliation);
		private static final ExecutorFragment _Affiliation__OclAny = new ExecutorFragment(Types._Affiliation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Affiliation__OclElement = new ExecutorFragment(Types._Affiliation, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AffiliationField__AffiliationField = new ExecutorFragment(Types._AffiliationField, Curriculum_vitaeTables.Types._AffiliationField);
		private static final ExecutorFragment _AffiliationField__OclAny = new ExecutorFragment(Types._AffiliationField, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AffiliationField__OclElement = new ExecutorFragment(Types._AffiliationField, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CitationName__CitationName = new ExecutorFragment(Types._CitationName, Curriculum_vitaeTables.Types._CitationName);
		private static final ExecutorFragment _CitationName__OclAny = new ExecutorFragment(Types._CitationName, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CitationName__OclElement = new ExecutorFragment(Types._CitationName, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CurriculumVitae__CurriculumVitae = new ExecutorFragment(Types._CurriculumVitae, Curriculum_vitaeTables.Types._CurriculumVitae);
		private static final ExecutorFragment _CurriculumVitae__OclAny = new ExecutorFragment(Types._CurriculumVitae, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CurriculumVitae__OclElement = new ExecutorFragment(Types._CurriculumVitae, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Degree__Degree = new ExecutorFragment(Types._Degree, Curriculum_vitaeTables.Types._Degree);
		private static final ExecutorFragment _Degree__OclAny = new ExecutorFragment(Types._Degree, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Degree__OclElement = new ExecutorFragment(Types._Degree, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Distinction__Distinction = new ExecutorFragment(Types._Distinction, Curriculum_vitaeTables.Types._Distinction);
		private static final ExecutorFragment _Distinction__OclAny = new ExecutorFragment(Types._Distinction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Distinction__OclElement = new ExecutorFragment(Types._Distinction, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DistinctionType__DistinctionType = new ExecutorFragment(Types._DistinctionType, Curriculum_vitaeTables.Types._DistinctionType);
		private static final ExecutorFragment _DistinctionType__OclAny = new ExecutorFragment(Types._DistinctionType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DistinctionType__OclElement = new ExecutorFragment(Types._DistinctionType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Idiom__Idiom = new ExecutorFragment(Types._Idiom, Curriculum_vitaeTables.Types._Idiom);
		private static final ExecutorFragment _Idiom__OclAny = new ExecutorFragment(Types._Idiom, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Idiom__OclElement = new ExecutorFragment(Types._Idiom, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Person__OclAny = new ExecutorFragment(Types._Person, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Person__OclElement = new ExecutorFragment(Types._Person, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Person__Person = new ExecutorFragment(Types._Person, Curriculum_vitaeTables.Types._Person);

		private static final ExecutorFragment _Project__OclAny = new ExecutorFragment(Types._Project, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Project__OclElement = new ExecutorFragment(Types._Project, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Project__Project = new ExecutorFragment(Types._Project, Curriculum_vitaeTables.Types._Project);

		private static final ExecutorFragment _Technology__OclAny = new ExecutorFragment(Types._Technology, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Technology__OclElement = new ExecutorFragment(Types._Technology, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Technology__Technology = new ExecutorFragment(Types._Technology, Curriculum_vitaeTables.Types._Technology);

		private static final ExecutorFragment _Website__OclAny = new ExecutorFragment(Types._Website, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Website__OclElement = new ExecutorFragment(Types._Website, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Website__Website = new ExecutorFragment(Types._Website, Curriculum_vitaeTables.Types._Website);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Curriculum_vitaeTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Curriculum_vitaeTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Curriculum_vitaeTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Activity__description = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.ACTIVITY__DESCRIPTION, Types._Activity, 0);
		public static final ExecutorProperty _Activity__role = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.ACTIVITY__ROLE, Types._Activity, 1);
		public static final ExecutorProperty _Activity__ActivityType__activities = new ExecutorPropertyWithImplementation("ActivityType", Types._Activity, 2, new EcoreLibraryOppositeProperty(Curriculum_vitaePackage.Literals.ACTIVITY_TYPE__ACTIVITIES));

		public static final ExecutorProperty _ActivityType__activities = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.ACTIVITY_TYPE__ACTIVITIES, Types._ActivityType, 0);
		public static final ExecutorProperty _ActivityType__type = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.ACTIVITY_TYPE__TYPE, Types._ActivityType, 1);
		public static final ExecutorProperty _ActivityType__Person__activity_types = new ExecutorPropertyWithImplementation("Person", Types._ActivityType, 2, new EcoreLibraryOppositeProperty(Curriculum_vitaePackage.Literals.PERSON__ACTIVITY_TYPES));

		public static final ExecutorProperty _Affiliation__employer = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.AFFILIATION__EMPLOYER, Types._Affiliation, 0);
		public static final ExecutorProperty _Affiliation__end = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.AFFILIATION__END, Types._Affiliation, 1);
		public static final ExecutorProperty _Affiliation__host_institution = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.AFFILIATION__HOST_INSTITUTION, Types._Affiliation, 2);
		public static final ExecutorProperty _Affiliation__role = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.AFFILIATION__ROLE, Types._Affiliation, 3);
		public static final ExecutorProperty _Affiliation__start = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.AFFILIATION__START, Types._Affiliation, 4);
		public static final ExecutorProperty _Affiliation__AffiliationField__affiliations = new ExecutorPropertyWithImplementation("AffiliationField", Types._Affiliation, 5, new EcoreLibraryOppositeProperty(Curriculum_vitaePackage.Literals.AFFILIATION_FIELD__AFFILIATIONS));

		public static final ExecutorProperty _AffiliationField__affiliations = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.AFFILIATION_FIELD__AFFILIATIONS, Types._AffiliationField, 0);
		public static final ExecutorProperty _AffiliationField__field = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.AFFILIATION_FIELD__FIELD, Types._AffiliationField, 1);
		public static final ExecutorProperty _AffiliationField__Person__affiliation_categories = new ExecutorPropertyWithImplementation("Person", Types._AffiliationField, 2, new EcoreLibraryOppositeProperty(Curriculum_vitaePackage.Literals.PERSON__AFFILIATION_CATEGORIES));

		public static final ExecutorProperty _CitationName__name = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.CITATION_NAME__NAME, Types._CitationName, 0);
		public static final ExecutorProperty _CitationName__Person__citation_names = new ExecutorPropertyWithImplementation("Person", Types._CitationName, 1, new EcoreLibraryOppositeProperty(Curriculum_vitaePackage.Literals.PERSON__CITATION_NAMES));

		public static final ExecutorProperty _CurriculumVitae__Person = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.CURRICULUM_VITAE__PERSON, Types._CurriculumVitae, 0);

		public static final ExecutorProperty _Degree__degree_name = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.DEGREE__DEGREE_NAME, Types._Degree, 0);
		public static final ExecutorProperty _Degree__end = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.DEGREE__END, Types._Degree, 1);
		public static final ExecutorProperty _Degree__institution = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.DEGREE__INSTITUTION, Types._Degree, 2);
		public static final ExecutorProperty _Degree__projects = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.DEGREE__PROJECTS, Types._Degree, 3);
		public static final ExecutorProperty _Degree__start = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.DEGREE__START, Types._Degree, 4);
		public static final ExecutorProperty _Degree__Person__degrees = new ExecutorPropertyWithImplementation("Person", Types._Degree, 5, new EcoreLibraryOppositeProperty(Curriculum_vitaePackage.Literals.PERSON__DEGREES));

		public static final ExecutorProperty _Distinction__date = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.DISTINCTION__DATE, Types._Distinction, 0);
		public static final ExecutorProperty _Distinction__name = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.DISTINCTION__NAME, Types._Distinction, 1);
		public static final ExecutorProperty _Distinction__DistinctionType__distinctions = new ExecutorPropertyWithImplementation("DistinctionType", Types._Distinction, 2, new EcoreLibraryOppositeProperty(Curriculum_vitaePackage.Literals.DISTINCTION_TYPE__DISTINCTIONS));

		public static final ExecutorProperty _DistinctionType__distinctions = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.DISTINCTION_TYPE__DISTINCTIONS, Types._DistinctionType, 0);
		public static final ExecutorProperty _DistinctionType__type = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.DISTINCTION_TYPE__TYPE, Types._DistinctionType, 1);
		public static final ExecutorProperty _DistinctionType__Person__distinction_types = new ExecutorPropertyWithImplementation("Person", Types._DistinctionType, 2, new EcoreLibraryOppositeProperty(Curriculum_vitaePackage.Literals.PERSON__DISTINCTION_TYPES));

		public static final ExecutorProperty _Idiom__lang = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.IDIOM__LANG, Types._Idiom, 0);
		public static final ExecutorProperty _Idiom__listening_qual = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.IDIOM__LISTENING_QUAL, Types._Idiom, 1);
		public static final ExecutorProperty _Idiom__reading_qual = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.IDIOM__READING_QUAL, Types._Idiom, 2);
		public static final ExecutorProperty _Idiom__speaking_qual = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.IDIOM__SPEAKING_QUAL, Types._Idiom, 3);
		public static final ExecutorProperty _Idiom__writing_qual = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.IDIOM__WRITING_QUAL, Types._Idiom, 4);
		public static final ExecutorProperty _Idiom__Person__idioms = new ExecutorPropertyWithImplementation("Person", Types._Idiom, 5, new EcoreLibraryOppositeProperty(Curriculum_vitaePackage.Literals.PERSON__IDIOMS));

		public static final ExecutorProperty _Person__activity_types = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.PERSON__ACTIVITY_TYPES, Types._Person, 0);
		public static final ExecutorProperty _Person__affiliation_categories = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.PERSON__AFFILIATION_CATEGORIES, Types._Person, 1);
		public static final ExecutorProperty _Person__citation_names = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.PERSON__CITATION_NAMES, Types._Person, 2);
		public static final ExecutorProperty _Person__date_of_birth = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.PERSON__DATE_OF_BIRTH, Types._Person, 3);
		public static final ExecutorProperty _Person__degrees = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.PERSON__DEGREES, Types._Person, 4);
		public static final ExecutorProperty _Person__description = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.PERSON__DESCRIPTION, Types._Person, 5);
		public static final ExecutorProperty _Person__distinction_types = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.PERSON__DISTINCTION_TYPES, Types._Person, 6);
		public static final ExecutorProperty _Person__full_name = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.PERSON__FULL_NAME, Types._Person, 7);
		public static final ExecutorProperty _Person__home_address = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.PERSON__HOME_ADDRESS, Types._Person, 8);
		public static final ExecutorProperty _Person__idioms = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.PERSON__IDIOMS, Types._Person, 9);
		public static final ExecutorProperty _Person__phone_number = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.PERSON__PHONE_NUMBER, Types._Person, 10);
		public static final ExecutorProperty _Person__projects = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.PERSON__PROJECTS, Types._Person, 11);
		public static final ExecutorProperty _Person__technologies = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.PERSON__TECHNOLOGIES, Types._Person, 12);
		public static final ExecutorProperty _Person__websites = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.PERSON__WEBSITES, Types._Person, 13);
		public static final ExecutorProperty _Person__CurriculumVitae__Person = new ExecutorPropertyWithImplementation("CurriculumVitae", Types._Person, 14, new EcoreLibraryOppositeProperty(Curriculum_vitaePackage.Literals.CURRICULUM_VITAE__PERSON));

		public static final ExecutorProperty _Project__description = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.PROJECT__DESCRIPTION, Types._Project, 0);
		public static final ExecutorProperty _Project__name = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.PROJECT__NAME, Types._Project, 1);
		public static final ExecutorProperty _Project__Degree__projects = new ExecutorPropertyWithImplementation("Degree", Types._Project, 2, new EcoreLibraryOppositeProperty(Curriculum_vitaePackage.Literals.DEGREE__PROJECTS));
		public static final ExecutorProperty _Project__Person__projects = new ExecutorPropertyWithImplementation("Person", Types._Project, 3, new EcoreLibraryOppositeProperty(Curriculum_vitaePackage.Literals.PERSON__PROJECTS));

		public static final ExecutorProperty _Technology__name = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.TECHNOLOGY__NAME, Types._Technology, 0);
		public static final ExecutorProperty _Technology__proficiency = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.TECHNOLOGY__PROFICIENCY, Types._Technology, 1);
		public static final ExecutorProperty _Technology__Person__technologies = new ExecutorPropertyWithImplementation("Person", Types._Technology, 2, new EcoreLibraryOppositeProperty(Curriculum_vitaePackage.Literals.PERSON__TECHNOLOGIES));

		public static final ExecutorProperty _Website__url = new EcoreExecutorProperty(Curriculum_vitaePackage.Literals.WEBSITE__URL, Types._Website, 0);
		public static final ExecutorProperty _Website__Person__websites = new ExecutorPropertyWithImplementation("Person", Types._Website, 1, new EcoreLibraryOppositeProperty(Curriculum_vitaePackage.Literals.PERSON__WEBSITES));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Curriculum_vitaeTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Activity =
			{
				Fragments._Activity__OclAny /* 0 */,
				Fragments._Activity__OclElement /* 1 */,
				Fragments._Activity__Activity /* 2 */
			};
		private static final int /*@NonNull*/ [] __Activity = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ActivityType =
			{
				Fragments._ActivityType__OclAny /* 0 */,
				Fragments._ActivityType__OclElement /* 1 */,
				Fragments._ActivityType__ActivityType /* 2 */
			};
		private static final int /*@NonNull*/ [] __ActivityType = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Affiliation =
			{
				Fragments._Affiliation__OclAny /* 0 */,
				Fragments._Affiliation__OclElement /* 1 */,
				Fragments._Affiliation__Affiliation /* 2 */
			};
		private static final int /*@NonNull*/ [] __Affiliation = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AffiliationField =
			{
				Fragments._AffiliationField__OclAny /* 0 */,
				Fragments._AffiliationField__OclElement /* 1 */,
				Fragments._AffiliationField__AffiliationField /* 2 */
			};
		private static final int /*@NonNull*/ [] __AffiliationField = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CitationName =
			{
				Fragments._CitationName__OclAny /* 0 */,
				Fragments._CitationName__OclElement /* 1 */,
				Fragments._CitationName__CitationName /* 2 */
			};
		private static final int /*@NonNull*/ [] __CitationName = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CurriculumVitae =
			{
				Fragments._CurriculumVitae__OclAny /* 0 */,
				Fragments._CurriculumVitae__OclElement /* 1 */,
				Fragments._CurriculumVitae__CurriculumVitae /* 2 */
			};
		private static final int /*@NonNull*/ [] __CurriculumVitae = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Degree =
			{
				Fragments._Degree__OclAny /* 0 */,
				Fragments._Degree__OclElement /* 1 */,
				Fragments._Degree__Degree /* 2 */
			};
		private static final int /*@NonNull*/ [] __Degree = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Distinction =
			{
				Fragments._Distinction__OclAny /* 0 */,
				Fragments._Distinction__OclElement /* 1 */,
				Fragments._Distinction__Distinction /* 2 */
			};
		private static final int /*@NonNull*/ [] __Distinction = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DistinctionType =
			{
				Fragments._DistinctionType__OclAny /* 0 */,
				Fragments._DistinctionType__OclElement /* 1 */,
				Fragments._DistinctionType__DistinctionType /* 2 */
			};
		private static final int /*@NonNull*/ [] __DistinctionType = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Idiom =
			{
				Fragments._Idiom__OclAny /* 0 */,
				Fragments._Idiom__OclElement /* 1 */,
				Fragments._Idiom__Idiom /* 2 */
			};
		private static final int /*@NonNull*/ [] __Idiom = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Person =
			{
				Fragments._Person__OclAny /* 0 */,
				Fragments._Person__OclElement /* 1 */,
				Fragments._Person__Person /* 2 */
			};
		private static final int /*@NonNull*/ [] __Person = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Project =
			{
				Fragments._Project__OclAny /* 0 */,
				Fragments._Project__OclElement /* 1 */,
				Fragments._Project__Project /* 2 */
			};
		private static final int /*@NonNull*/ [] __Project = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Technology =
			{
				Fragments._Technology__OclAny /* 0 */,
				Fragments._Technology__OclElement /* 1 */,
				Fragments._Technology__Technology /* 2 */
			};
		private static final int /*@NonNull*/ [] __Technology = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Website =
			{
				Fragments._Website__OclAny /* 0 */,
				Fragments._Website__OclElement /* 1 */,
				Fragments._Website__Website /* 2 */
			};
		private static final int /*@NonNull*/ [] __Website = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Activity.initFragments(_Activity, __Activity);
			Types._ActivityType.initFragments(_ActivityType, __ActivityType);
			Types._Affiliation.initFragments(_Affiliation, __Affiliation);
			Types._AffiliationField.initFragments(_AffiliationField, __AffiliationField);
			Types._CitationName.initFragments(_CitationName, __CitationName);
			Types._CurriculumVitae.initFragments(_CurriculumVitae, __CurriculumVitae);
			Types._Degree.initFragments(_Degree, __Degree);
			Types._Distinction.initFragments(_Distinction, __Distinction);
			Types._DistinctionType.initFragments(_DistinctionType, __DistinctionType);
			Types._Idiom.initFragments(_Idiom, __Idiom);
			Types._Person.initFragments(_Person, __Person);
			Types._Project.initFragments(_Project, __Project);
			Types._Technology.initFragments(_Technology, __Technology);
			Types._Website.initFragments(_Website, __Website);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Curriculum_vitaeTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Activity__Activity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Activity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Activity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ActivityType__ActivityType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ActivityType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ActivityType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Affiliation__Affiliation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Affiliation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Affiliation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AffiliationField__AffiliationField = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AffiliationField__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AffiliationField__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CitationName__CitationName = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CitationName__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CitationName__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CurriculumVitae__CurriculumVitae = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CurriculumVitae__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CurriculumVitae__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Degree__Degree = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Degree__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Degree__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Distinction__Distinction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Distinction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Distinction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DistinctionType__DistinctionType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DistinctionType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DistinctionType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Idiom__Idiom = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Idiom__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Idiom__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Person__Person = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Person__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Person__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Project__Project = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Project__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Project__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Technology__Technology = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Technology__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Technology__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Website__Website = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Website__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Website__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Activity__Activity.initOperations(_Activity__Activity);
			Fragments._Activity__OclAny.initOperations(_Activity__OclAny);
			Fragments._Activity__OclElement.initOperations(_Activity__OclElement);

			Fragments._ActivityType__ActivityType.initOperations(_ActivityType__ActivityType);
			Fragments._ActivityType__OclAny.initOperations(_ActivityType__OclAny);
			Fragments._ActivityType__OclElement.initOperations(_ActivityType__OclElement);

			Fragments._Affiliation__Affiliation.initOperations(_Affiliation__Affiliation);
			Fragments._Affiliation__OclAny.initOperations(_Affiliation__OclAny);
			Fragments._Affiliation__OclElement.initOperations(_Affiliation__OclElement);

			Fragments._AffiliationField__AffiliationField.initOperations(_AffiliationField__AffiliationField);
			Fragments._AffiliationField__OclAny.initOperations(_AffiliationField__OclAny);
			Fragments._AffiliationField__OclElement.initOperations(_AffiliationField__OclElement);

			Fragments._CitationName__CitationName.initOperations(_CitationName__CitationName);
			Fragments._CitationName__OclAny.initOperations(_CitationName__OclAny);
			Fragments._CitationName__OclElement.initOperations(_CitationName__OclElement);

			Fragments._CurriculumVitae__CurriculumVitae.initOperations(_CurriculumVitae__CurriculumVitae);
			Fragments._CurriculumVitae__OclAny.initOperations(_CurriculumVitae__OclAny);
			Fragments._CurriculumVitae__OclElement.initOperations(_CurriculumVitae__OclElement);

			Fragments._Degree__Degree.initOperations(_Degree__Degree);
			Fragments._Degree__OclAny.initOperations(_Degree__OclAny);
			Fragments._Degree__OclElement.initOperations(_Degree__OclElement);

			Fragments._Distinction__Distinction.initOperations(_Distinction__Distinction);
			Fragments._Distinction__OclAny.initOperations(_Distinction__OclAny);
			Fragments._Distinction__OclElement.initOperations(_Distinction__OclElement);

			Fragments._DistinctionType__DistinctionType.initOperations(_DistinctionType__DistinctionType);
			Fragments._DistinctionType__OclAny.initOperations(_DistinctionType__OclAny);
			Fragments._DistinctionType__OclElement.initOperations(_DistinctionType__OclElement);

			Fragments._Idiom__Idiom.initOperations(_Idiom__Idiom);
			Fragments._Idiom__OclAny.initOperations(_Idiom__OclAny);
			Fragments._Idiom__OclElement.initOperations(_Idiom__OclElement);

			Fragments._Person__OclAny.initOperations(_Person__OclAny);
			Fragments._Person__OclElement.initOperations(_Person__OclElement);
			Fragments._Person__Person.initOperations(_Person__Person);

			Fragments._Project__OclAny.initOperations(_Project__OclAny);
			Fragments._Project__OclElement.initOperations(_Project__OclElement);
			Fragments._Project__Project.initOperations(_Project__Project);

			Fragments._Technology__OclAny.initOperations(_Technology__OclAny);
			Fragments._Technology__OclElement.initOperations(_Technology__OclElement);
			Fragments._Technology__Technology.initOperations(_Technology__Technology);

			Fragments._Website__OclAny.initOperations(_Website__OclAny);
			Fragments._Website__OclElement.initOperations(_Website__OclElement);
			Fragments._Website__Website.initOperations(_Website__Website);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Curriculum_vitaeTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Activity = {
			Curriculum_vitaeTables.Properties._Activity__description,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Curriculum_vitaeTables.Properties._Activity__role
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ActivityType = {
			Curriculum_vitaeTables.Properties._ActivityType__activities,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Curriculum_vitaeTables.Properties._ActivityType__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Affiliation = {
			Curriculum_vitaeTables.Properties._Affiliation__employer,
			Curriculum_vitaeTables.Properties._Affiliation__end,
			Curriculum_vitaeTables.Properties._Affiliation__host_institution,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Curriculum_vitaeTables.Properties._Affiliation__role,
			Curriculum_vitaeTables.Properties._Affiliation__start
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AffiliationField = {
			Curriculum_vitaeTables.Properties._AffiliationField__affiliations,
			Curriculum_vitaeTables.Properties._AffiliationField__field,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CitationName = {
			Curriculum_vitaeTables.Properties._CitationName__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CurriculumVitae = {
			Curriculum_vitaeTables.Properties._CurriculumVitae__Person,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Degree = {
			Curriculum_vitaeTables.Properties._Degree__degree_name,
			Curriculum_vitaeTables.Properties._Degree__end,
			Curriculum_vitaeTables.Properties._Degree__institution,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Curriculum_vitaeTables.Properties._Degree__projects,
			Curriculum_vitaeTables.Properties._Degree__start
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Distinction = {
			Curriculum_vitaeTables.Properties._Distinction__date,
			Curriculum_vitaeTables.Properties._Distinction__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DistinctionType = {
			Curriculum_vitaeTables.Properties._DistinctionType__distinctions,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Curriculum_vitaeTables.Properties._DistinctionType__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Idiom = {
			Curriculum_vitaeTables.Properties._Idiom__lang,
			Curriculum_vitaeTables.Properties._Idiom__listening_qual,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Curriculum_vitaeTables.Properties._Idiom__reading_qual,
			Curriculum_vitaeTables.Properties._Idiom__speaking_qual,
			Curriculum_vitaeTables.Properties._Idiom__writing_qual
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Person = {
			Curriculum_vitaeTables.Properties._Person__activity_types,
			Curriculum_vitaeTables.Properties._Person__affiliation_categories,
			Curriculum_vitaeTables.Properties._Person__citation_names,
			Curriculum_vitaeTables.Properties._Person__date_of_birth,
			Curriculum_vitaeTables.Properties._Person__degrees,
			Curriculum_vitaeTables.Properties._Person__description,
			Curriculum_vitaeTables.Properties._Person__distinction_types,
			Curriculum_vitaeTables.Properties._Person__full_name,
			Curriculum_vitaeTables.Properties._Person__home_address,
			Curriculum_vitaeTables.Properties._Person__idioms,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Curriculum_vitaeTables.Properties._Person__phone_number,
			Curriculum_vitaeTables.Properties._Person__projects,
			Curriculum_vitaeTables.Properties._Person__technologies,
			Curriculum_vitaeTables.Properties._Person__websites
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Project = {
			Curriculum_vitaeTables.Properties._Project__description,
			Curriculum_vitaeTables.Properties._Project__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Technology = {
			Curriculum_vitaeTables.Properties._Technology__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Curriculum_vitaeTables.Properties._Technology__proficiency
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Website = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Curriculum_vitaeTables.Properties._Website__url
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Activity__Activity.initProperties(_Activity);
			Fragments._ActivityType__ActivityType.initProperties(_ActivityType);
			Fragments._Affiliation__Affiliation.initProperties(_Affiliation);
			Fragments._AffiliationField__AffiliationField.initProperties(_AffiliationField);
			Fragments._CitationName__CitationName.initProperties(_CitationName);
			Fragments._CurriculumVitae__CurriculumVitae.initProperties(_CurriculumVitae);
			Fragments._Degree__Degree.initProperties(_Degree);
			Fragments._Distinction__Distinction.initProperties(_Distinction);
			Fragments._DistinctionType__DistinctionType.initProperties(_DistinctionType);
			Fragments._Idiom__Idiom.initProperties(_Idiom);
			Fragments._Person__Person.initProperties(_Person);
			Fragments._Project__Project.initProperties(_Project);
			Fragments._Technology__Technology.initProperties(_Technology);
			Fragments._Website__Website.initProperties(_Website);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Curriculum_vitaeTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Curriculum_vitaeTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Curriculum_vitaeTables();
	}

	private Curriculum_vitaeTables() {
		super(Curriculum_vitaePackage.eNS_URI);
	}
}

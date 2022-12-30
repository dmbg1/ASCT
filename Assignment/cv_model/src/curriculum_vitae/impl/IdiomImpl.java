/**
 */
package curriculum_vitae.impl;

import curriculum_vitae.Curriculum_vitaePackage;
import curriculum_vitae.Curriculum_vitaeTables;
import curriculum_vitae.Idiom;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Idiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link curriculum_vitae.impl.IdiomImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link curriculum_vitae.impl.IdiomImpl#getSpeaking_qual <em>Speaking qual</em>}</li>
 *   <li>{@link curriculum_vitae.impl.IdiomImpl#getReading_qual <em>Reading qual</em>}</li>
 *   <li>{@link curriculum_vitae.impl.IdiomImpl#getWriting_qual <em>Writing qual</em>}</li>
 *   <li>{@link curriculum_vitae.impl.IdiomImpl#getListening_qual <em>Listening qual</em>}</li>
 *   <li>{@link curriculum_vitae.impl.IdiomImpl#isNative_lang <em>Native lang</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdiomImpl extends MinimalEObjectImpl.Container implements Idiom {
	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeaking_qual() <em>Speaking qual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeaking_qual()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEAKING_QUAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpeaking_qual() <em>Speaking qual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeaking_qual()
	 * @generated
	 * @ordered
	 */
	protected String speaking_qual = SPEAKING_QUAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReading_qual() <em>Reading qual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReading_qual()
	 * @generated
	 * @ordered
	 */
	protected static final String READING_QUAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReading_qual() <em>Reading qual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReading_qual()
	 * @generated
	 * @ordered
	 */
	protected String reading_qual = READING_QUAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriting_qual() <em>Writing qual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriting_qual()
	 * @generated
	 * @ordered
	 */
	protected static final String WRITING_QUAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriting_qual() <em>Writing qual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriting_qual()
	 * @generated
	 * @ordered
	 */
	protected String writing_qual = WRITING_QUAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getListening_qual() <em>Listening qual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListening_qual()
	 * @generated
	 * @ordered
	 */
	protected static final String LISTENING_QUAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListening_qual() <em>Listening qual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListening_qual()
	 * @generated
	 * @ordered
	 */
	protected String listening_qual = LISTENING_QUAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isNative_lang() <em>Native lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNative_lang()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NATIVE_LANG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNative_lang() <em>Native lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNative_lang()
	 * @generated
	 * @ordered
	 */
	protected boolean native_lang = NATIVE_LANG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Curriculum_vitaePackage.Literals.IDIOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.IDIOM__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpeaking_qual() {
		return speaking_qual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeaking_qual(String newSpeaking_qual) {
		String oldSpeaking_qual = speaking_qual;
		speaking_qual = newSpeaking_qual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.IDIOM__SPEAKING_QUAL, oldSpeaking_qual, speaking_qual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReading_qual() {
		return reading_qual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReading_qual(String newReading_qual) {
		String oldReading_qual = reading_qual;
		reading_qual = newReading_qual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.IDIOM__READING_QUAL, oldReading_qual, reading_qual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWriting_qual() {
		return writing_qual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriting_qual(String newWriting_qual) {
		String oldWriting_qual = writing_qual;
		writing_qual = newWriting_qual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.IDIOM__WRITING_QUAL, oldWriting_qual, writing_qual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListening_qual() {
		return listening_qual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListening_qual(String newListening_qual) {
		String oldListening_qual = listening_qual;
		listening_qual = newListening_qual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.IDIOM__LISTENING_QUAL, oldListening_qual, listening_qual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNative_lang() {
		return native_lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNative_lang(boolean newNative_lang) {
		boolean oldNative_lang = native_lang;
		native_lang = newNative_lang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Curriculum_vitaePackage.IDIOM__NATIVE_LANG, oldNative_lang, native_lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean listening_qual_restriction(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Idiom::listening_qual_restriction";
		try {
			/**
			 *
			 * inv listening_qual_restriction:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = Set{'C1', 'c1', 'C2', 'c2', 'B1', 'b1', 'B2', 'b2', 'A1', 'a1', 'A2', 'a2'
			 *         }
			 *         ->includes(self.listening_qual)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Curriculum_vitaePackage.Literals.IDIOM___LISTENING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Curriculum_vitaeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ String listening_qual = this.getListening_qual();
					final /*@Thrown*/ boolean result = CollectionIncludesOperation.INSTANCE.evaluate(Curriculum_vitaeTables.Set_0, listening_qual).booleanValue();
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Curriculum_vitaeTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean speaking_qual_restriction(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Idiom::speaking_qual_restriction";
		try {
			/**
			 *
			 * inv speaking_qual_restriction:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = Set{'C1', 'c1', 'C2', 'c2', 'B1', 'b1', 'B2', 'b2', 'A1', 'a1', 'A2', 'a2'
			 *         }
			 *         ->includes(self.speaking_qual)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Curriculum_vitaePackage.Literals.IDIOM___SPEAKING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Curriculum_vitaeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ String speaking_qual = this.getSpeaking_qual();
					final /*@Thrown*/ boolean result = CollectionIncludesOperation.INSTANCE.evaluate(Curriculum_vitaeTables.Set_0, speaking_qual).booleanValue();
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Curriculum_vitaeTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean reading_qual_restriction(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Idiom::reading_qual_restriction";
		try {
			/**
			 *
			 * inv reading_qual_restriction:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = Set{'C1', 'c1', 'C2', 'c2', 'B1', 'b1', 'B2', 'b2', 'A1', 'a1', 'A2', 'a2'
			 *         }
			 *         ->includes(self.reading_qual)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Curriculum_vitaePackage.Literals.IDIOM___READING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Curriculum_vitaeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ String reading_qual = this.getReading_qual();
					final /*@Thrown*/ boolean result = CollectionIncludesOperation.INSTANCE.evaluate(Curriculum_vitaeTables.Set_0, reading_qual).booleanValue();
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Curriculum_vitaeTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean writing_qual_restriction(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Idiom::writing_qual_restriction";
		try {
			/**
			 *
			 * inv writing_qual_restriction:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = Set{'C1', 'c1', 'C2', 'c2', 'B1', 'b1', 'B2', 'b2', 'A1', 'a1', 'A2', 'a2'
			 *         }
			 *         ->includes(self.writing_qual)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Curriculum_vitaePackage.Literals.IDIOM___WRITING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Curriculum_vitaeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ String writing_qual = this.getWriting_qual();
					final /*@Thrown*/ boolean result = CollectionIncludesOperation.INSTANCE.evaluate(Curriculum_vitaeTables.Set_0, writing_qual).booleanValue();
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Curriculum_vitaeTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Curriculum_vitaePackage.IDIOM__LANG:
				return getLang();
			case Curriculum_vitaePackage.IDIOM__SPEAKING_QUAL:
				return getSpeaking_qual();
			case Curriculum_vitaePackage.IDIOM__READING_QUAL:
				return getReading_qual();
			case Curriculum_vitaePackage.IDIOM__WRITING_QUAL:
				return getWriting_qual();
			case Curriculum_vitaePackage.IDIOM__LISTENING_QUAL:
				return getListening_qual();
			case Curriculum_vitaePackage.IDIOM__NATIVE_LANG:
				return isNative_lang();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Curriculum_vitaePackage.IDIOM__LANG:
				setLang((String)newValue);
				return;
			case Curriculum_vitaePackage.IDIOM__SPEAKING_QUAL:
				setSpeaking_qual((String)newValue);
				return;
			case Curriculum_vitaePackage.IDIOM__READING_QUAL:
				setReading_qual((String)newValue);
				return;
			case Curriculum_vitaePackage.IDIOM__WRITING_QUAL:
				setWriting_qual((String)newValue);
				return;
			case Curriculum_vitaePackage.IDIOM__LISTENING_QUAL:
				setListening_qual((String)newValue);
				return;
			case Curriculum_vitaePackage.IDIOM__NATIVE_LANG:
				setNative_lang((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Curriculum_vitaePackage.IDIOM__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Curriculum_vitaePackage.IDIOM__SPEAKING_QUAL:
				setSpeaking_qual(SPEAKING_QUAL_EDEFAULT);
				return;
			case Curriculum_vitaePackage.IDIOM__READING_QUAL:
				setReading_qual(READING_QUAL_EDEFAULT);
				return;
			case Curriculum_vitaePackage.IDIOM__WRITING_QUAL:
				setWriting_qual(WRITING_QUAL_EDEFAULT);
				return;
			case Curriculum_vitaePackage.IDIOM__LISTENING_QUAL:
				setListening_qual(LISTENING_QUAL_EDEFAULT);
				return;
			case Curriculum_vitaePackage.IDIOM__NATIVE_LANG:
				setNative_lang(NATIVE_LANG_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Curriculum_vitaePackage.IDIOM__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Curriculum_vitaePackage.IDIOM__SPEAKING_QUAL:
				return SPEAKING_QUAL_EDEFAULT == null ? speaking_qual != null : !SPEAKING_QUAL_EDEFAULT.equals(speaking_qual);
			case Curriculum_vitaePackage.IDIOM__READING_QUAL:
				return READING_QUAL_EDEFAULT == null ? reading_qual != null : !READING_QUAL_EDEFAULT.equals(reading_qual);
			case Curriculum_vitaePackage.IDIOM__WRITING_QUAL:
				return WRITING_QUAL_EDEFAULT == null ? writing_qual != null : !WRITING_QUAL_EDEFAULT.equals(writing_qual);
			case Curriculum_vitaePackage.IDIOM__LISTENING_QUAL:
				return LISTENING_QUAL_EDEFAULT == null ? listening_qual != null : !LISTENING_QUAL_EDEFAULT.equals(listening_qual);
			case Curriculum_vitaePackage.IDIOM__NATIVE_LANG:
				return native_lang != NATIVE_LANG_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Curriculum_vitaePackage.IDIOM___LISTENING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP:
				return listening_qual_restriction((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Curriculum_vitaePackage.IDIOM___SPEAKING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP:
				return speaking_qual_restriction((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Curriculum_vitaePackage.IDIOM___READING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP:
				return reading_qual_restriction((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Curriculum_vitaePackage.IDIOM___WRITING_QUAL_RESTRICTION__DIAGNOSTICCHAIN_MAP:
				return writing_qual_restriction((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (lang: ");
		result.append(lang);
		result.append(", speaking_qual: ");
		result.append(speaking_qual);
		result.append(", reading_qual: ");
		result.append(reading_qual);
		result.append(", writing_qual: ");
		result.append(writing_qual);
		result.append(", listening_qual: ");
		result.append(listening_qual);
		result.append(", native_lang: ");
		result.append(native_lang);
		result.append(')');
		return result.toString();
	}

} //IdiomImpl

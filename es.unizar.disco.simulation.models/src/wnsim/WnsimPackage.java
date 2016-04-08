/**
 */
package wnsim;

import configuration.ConfigurationPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see wnsim.WnsimFactory
 * @model kind="package"
 * @generated
 */
public interface WnsimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wnsim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.unizar.disco/simulation/configuration/wnsim/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wnsim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WnsimPackage eINSTANCE = wnsim.impl.WnsimPackageImpl.init();

	/**
	 * The meta object id for the '{@link wnsim.impl.WnsimResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wnsim.impl.WnsimResultImpl
	 * @see wnsim.impl.WnsimPackageImpl#getWnsimResult()
	 * @generated
	 */
	int WNSIM_RESULT = 0;

	/**
	 * The feature id for the '<em><b>Infos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNSIM_RESULT__INFOS = ConfigurationPackage.TOOL_RESULT__INFOS;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNSIM_RESULT_FEATURE_COUNT = ConfigurationPackage.TOOL_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNSIM_RESULT_OPERATION_COUNT = ConfigurationPackage.TOOL_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wnsim.impl.WnsimElementInfoImpl <em>Element Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wnsim.impl.WnsimElementInfoImpl
	 * @see wnsim.impl.WnsimPackageImpl#getWnsimElementInfo()
	 * @generated
	 */
	int WNSIM_ELEMENT_INFO = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNSIM_ELEMENT_INFO__ELEMENT = ConfigurationPackage.ANALYZABLE_ELEMENT_INFO__ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNSIM_ELEMENT_INFO__VALUE = ConfigurationPackage.ANALYZABLE_ELEMENT_INFO__VALUE;

	/**
	 * The number of structural features of the '<em>Element Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNSIM_ELEMENT_INFO_FEATURE_COUNT = ConfigurationPackage.ANALYZABLE_ELEMENT_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNSIM_ELEMENT_INFO_OPERATION_COUNT = ConfigurationPackage.ANALYZABLE_ELEMENT_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wnsim.impl.PlaceInfoImpl <em>Place Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wnsim.impl.PlaceInfoImpl
	 * @see wnsim.impl.WnsimPackageImpl#getPlaceInfo()
	 * @generated
	 */
	int PLACE_INFO = 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_INFO__ELEMENT = WNSIM_ELEMENT_INFO__ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_INFO__VALUE = WNSIM_ELEMENT_INFO__VALUE;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_INFO__THROUGHPUT = WNSIM_ELEMENT_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_INFO_FEATURE_COUNT = WNSIM_ELEMENT_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Place Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_INFO_OPERATION_COUNT = WNSIM_ELEMENT_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wnsim.impl.TransitionInfoImpl <em>Transition Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wnsim.impl.TransitionInfoImpl
	 * @see wnsim.impl.WnsimPackageImpl#getTransitionInfo()
	 * @generated
	 */
	int TRANSITION_INFO = 3;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_INFO__ELEMENT = WNSIM_ELEMENT_INFO__ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_INFO__VALUE = WNSIM_ELEMENT_INFO__VALUE;

	/**
	 * The feature id for the '<em><b>Mean Number Of Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_INFO__MEAN_NUMBER_OF_TOKENS = WNSIM_ELEMENT_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_INFO_FEATURE_COUNT = WNSIM_ELEMENT_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transition Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_INFO_OPERATION_COUNT = WNSIM_ELEMENT_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wnsim.SimulationParameters <em>Simulation Parameters</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wnsim.SimulationParameters
	 * @see wnsim.impl.WnsimPackageImpl#getSimulationParameters()
	 * @generated
	 */
	int SIMULATION_PARAMETERS = 4;


	/**
	 * Returns the meta object for class '{@link wnsim.WnsimResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see wnsim.WnsimResult
	 * @generated
	 */
	EClass getWnsimResult();

	/**
	 * Returns the meta object for class '{@link wnsim.WnsimElementInfo <em>Element Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Info</em>'.
	 * @see wnsim.WnsimElementInfo
	 * @generated
	 */
	EClass getWnsimElementInfo();

	/**
	 * Returns the meta object for class '{@link wnsim.PlaceInfo <em>Place Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Info</em>'.
	 * @see wnsim.PlaceInfo
	 * @generated
	 */
	EClass getPlaceInfo();

	/**
	 * Returns the meta object for the attribute '{@link wnsim.PlaceInfo#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see wnsim.PlaceInfo#getThroughput()
	 * @see #getPlaceInfo()
	 * @generated
	 */
	EAttribute getPlaceInfo_Throughput();

	/**
	 * Returns the meta object for class '{@link wnsim.TransitionInfo <em>Transition Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Info</em>'.
	 * @see wnsim.TransitionInfo
	 * @generated
	 */
	EClass getTransitionInfo();

	/**
	 * Returns the meta object for the attribute '{@link wnsim.TransitionInfo#getMeanNumberOfTokens <em>Mean Number Of Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Number Of Tokens</em>'.
	 * @see wnsim.TransitionInfo#getMeanNumberOfTokens()
	 * @see #getTransitionInfo()
	 * @generated
	 */
	EAttribute getTransitionInfo_MeanNumberOfTokens();

	/**
	 * Returns the meta object for enum '{@link wnsim.SimulationParameters <em>Simulation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simulation Parameters</em>'.
	 * @see wnsim.SimulationParameters
	 * @generated
	 */
	EEnum getSimulationParameters();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WnsimFactory getWnsimFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link wnsim.impl.WnsimResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wnsim.impl.WnsimResultImpl
		 * @see wnsim.impl.WnsimPackageImpl#getWnsimResult()
		 * @generated
		 */
		EClass WNSIM_RESULT = eINSTANCE.getWnsimResult();

		/**
		 * The meta object literal for the '{@link wnsim.impl.WnsimElementInfoImpl <em>Element Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wnsim.impl.WnsimElementInfoImpl
		 * @see wnsim.impl.WnsimPackageImpl#getWnsimElementInfo()
		 * @generated
		 */
		EClass WNSIM_ELEMENT_INFO = eINSTANCE.getWnsimElementInfo();

		/**
		 * The meta object literal for the '{@link wnsim.impl.PlaceInfoImpl <em>Place Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wnsim.impl.PlaceInfoImpl
		 * @see wnsim.impl.WnsimPackageImpl#getPlaceInfo()
		 * @generated
		 */
		EClass PLACE_INFO = eINSTANCE.getPlaceInfo();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_INFO__THROUGHPUT = eINSTANCE.getPlaceInfo_Throughput();

		/**
		 * The meta object literal for the '{@link wnsim.impl.TransitionInfoImpl <em>Transition Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wnsim.impl.TransitionInfoImpl
		 * @see wnsim.impl.WnsimPackageImpl#getTransitionInfo()
		 * @generated
		 */
		EClass TRANSITION_INFO = eINSTANCE.getTransitionInfo();

		/**
		 * The meta object literal for the '<em><b>Mean Number Of Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_INFO__MEAN_NUMBER_OF_TOKENS = eINSTANCE.getTransitionInfo_MeanNumberOfTokens();

		/**
		 * The meta object literal for the '{@link wnsim.SimulationParameters <em>Simulation Parameters</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wnsim.SimulationParameters
		 * @see wnsim.impl.WnsimPackageImpl#getSimulationParameters()
		 * @generated
		 */
		EEnum SIMULATION_PARAMETERS = eINSTANCE.getSimulationParameters();

	}

} //WnsimPackage

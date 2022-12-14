import './App.css';
import Filter from './components/filter';
import Header from './components/header';
import PieChartCard from './components/pie-chart-card';
import SalesByDate from './components/sales-by-date';
import SalesSummary from './components/sales-summary';
import SalesTable from './components/sales-table';

function App() {
  return (
    <>
      <Header />
      <div className="app-container">
        <Filter />
        <SalesByDate />
        <div className='sales-overview-container'>
        <SalesSummary />
        <PieChartCard name='Lojas' labels={['Uberlandia', 'Araguari', 'São Paulo']}
         series={[40, 30, 30]} />
          <PieChartCard name='Pagamento' labels={['Credito', 'Debito', 'Dinheiro']}
         series={[20, 50, 30]} />
        </div>
        <SalesTable></SalesTable>
      </div>
    </>
  );
}

export default App;

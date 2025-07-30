import Spline from '@splinetool/react-spline/next';

export default function Home() {
  return (
    <main style={{
      width: '100vw',
      height: '100vh',
      display: 'flex',
      alignItems: 'center',
      justifyContent: 'center',
      background: '#f5f5f5'
    }}>
      <Spline
        scene="https://prod.spline.design/vgtsNUCJ1JBpWRE7/scene.splinecode"
        style={{
          width: '80vw',
          height: '80vh',
          borderRadius: '16px',
          boxShadow: '0 4px 24px rgba(0,0,0,0.1)'
        }}
      />
    </main>
  );
}
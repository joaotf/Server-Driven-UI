import React from 'react';
import { BeagleProvider, BeagleRemoteView } from '@zup-it/beagle-react';
import BeagleService from './beagle-service';

function App() {

  return (
    <BeagleProvider value={BeagleService}>
      <BeagleRemoteView route = {"/homepage"} />
    </BeagleProvider>
  );
}

export default App;